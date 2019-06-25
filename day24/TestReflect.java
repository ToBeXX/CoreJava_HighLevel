package day24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
	/*	Field    ：    属性
		Method  ：    方法
		Constructor    构造方法*/
		
		Student s = new Student();
//		获取类对象的三种方式
		Class c = s.getClass();
		Class c1 = Student.class;
//		重要可能常用
		Class c2 = Class.forName("day24.Student");
//		获取全类名
		System.out.println(c.getName());
//		获取包名
		System.out.println(c.getPackage().getName());
//		获取父类
		System.out.println(c.getSuperclass().getName());
//		获取所有公开方法包括父类
		Method[] m = c2.getMethods();
		System.out.println(m.length);
		for(Method m1 :m){
			System.out.println(m1);
		}
//		获取所有方法包含私有的（不包含父类）
		Method[] m2 = c2.getDeclaredMethods();
		System.out.println(m2.length);
		for(Method m1 :m2){
			System.out.println(m1);
		}
//		获取接口们
		Class[] interfaces = c2.getInterfaces();
		System.out.println(interfaces.length);
		
//		获取公开构造方法
		Constructor[] con = c2.getConstructors();
		System.out.println(con.length);
//		获取多有构造方法
		Constructor[] con1 = c2.getDeclaredConstructors();
		System.out.println(con1.length);
//		利用反射创建对象
//		无参
		Object o = c.newInstance();
//		有参
		Constructor<Student> cc = c.getConstructor(String.class,int.class,double.class);
		Student o1 = cc.newInstance("mgx",18,3000.0);
		System.out.println(o1);
//		访问私有属性
		Field f = c2.getDeclaredField("name");
		f.setAccessible(true);
		System.out.println(f.get(o1));
		f.set(o1, "xiaoya");
		System.out.println(f.get(o1));
//		访问方法
		Method met = c2.getMethod("study",String.class);
		Object ob = met.invoke(o1,"corejava");
//		访问私用方法
		Method method = c2.getDeclaredMethod("study");
		method.setAccessible(true);
		method.invoke(o1);
	}
}
class Student{
	private String name;
	private int age;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Student(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Student() {
		super();
	}
	private  Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	private void study(){
		System.out.println("study");
	}
	public void study(String s ){
		System.out.println("study"+s);
	}
}
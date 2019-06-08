package day14;
import java.util.*;
//��һ��
/*��Object���У������finalize��������������ʱ���ã�toString()��������ֵ��ʾ�ö����String��ʽ
equals������ΪΪ�ж��������������Ƿ���ͬ��getClass��������Ϊ���ض������ʵ���ݡ�*/
//�ڶ���
class Student{
	private int age;
	private String name;
	public Student(){}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name + " " + age;
	}
}
class TestStudent{
	public static void main(String[] args){
		Student stu1 = new Student();
		Student stu2 = new Student("Tom" , 18);
		System.out.println(stu1);
		System.out.println(stu2);
	}
}
/*null 0
Tom 18
*/
//������
class TestEquals{
	public static void main(String[] args){
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
	}
}
/*
true
false
*/
//������
class Animal{
	class Dog extends Animal{}
	class TestGetClass{
		public void main(String[] args){
			Animal a1 = new Dog();
			Animal a2 = new Animal();
			System.out.println(a1 instanceof Animal);
			System.out.println(a1.getClass() == a2.getClass());
		}
	}
}
/*
true
flase
*/
//������
class Worker{
	String name;
	int age;
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Worker w = (Worker)o;
		if(this.name.equals(w) && this.age == w.age) return true;
		else return false;
	}
	@Override
	public String toString(){
		return "������"+name+";���䣺"+age;
	}
}
//��7��
class TestInt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = Integer.parseInt(str);
		Integer i = new Integer(str);
		int b = i.intValue();
		System.out.println(a);
		System.out.println(b);
	}
}
//��8��
class Student1{
	private int age;
	private String name;
	public Student1(){}
	public Student1(String name,int age){
		this.name = name;
		this.age = age;
	}
	class TestStudent1{
		public void main(String[] args){
			Student1 stu1 = new Student1("Tom",18);
			System.out.println(stu1+""+100);
		}
	}
}
/*
 * 100 + " " +stu1
 * stu1+ " " + 100
 * " " + stu1a +100
 */
//��9��
class OuterClass{
	private int value1 = 100;
	private static int value2 = 200;
	public void method(int value3){
		final int value4 = 400;
		class InnerClass{
			public void print(){
				System.out.println(value4);
			}
		}
	}
}
// value1 value2 value4
//��10��
interface Light{
	void shine();
}
class Lamp{
	public void on(Light light){
		light.shine();
	}
}
class TestLamp{
	public static void main(String[] args){
		Lamp lamp = new Lamp();
		//1
		class RedLight implements Light{
			public void shine(){
				System.out.println("�����");
			}
		}
		RedLight redLight = new RedLight();
		lamp.on(redLight);
		//2
		Light blueLight = new Light(){
			public void shine(){
				System.out.println("������");
			}
		};
		lamp.on(blueLight);
	}
}
//��11��
//��12��
//��13��
//��14��
//��15��
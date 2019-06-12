package day15;

//第1遍
public class TestAnimal {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
//		打印a1运行时的类型
		System.out.println(a1.getClass());
//		打印a2运行时的类型
		System.out.println(a2.getClass());
//		判断a1 a2真实类型是否相同
		System.out.println(a1.getClass() == a2.getClass());// false
		Animal1 a3 = new Animal1("Dog1", 10, true);
		Animal1 a4 = new Animal1("Dog2", 1, false);
//		打印a3相当于打印a3.toString();  Animal类重写了toString()方法打印该对象的属性
		System.out.println(a3);
		System.out.println(a4);
	}
}

class Animal1 {
	String name;
	int age;
	boolean sex;

	public Animal1() {
		super();
	}

	public Animal1(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
//   重写toString()方法 打印对象的属性值
	public String toString() {
		return name + "\t" + age + "\t" + sex;
	}

	// 重写equlas方法
	public boolean equals(Object o) {
		// 1.比较两者是否为同一对象
		if (this == o)
			return true;
		// 2.非空判断 判断o是否为null
		if (o == null)
			return false;
		// 3.判断两者(this和o)类型是否一致
		if (this.getClass() != o.getClass())
			return false;
		// 4.强制类型转换
		Animal1 a = (Animal1) o;
		// 5.比较属性值是否相同
		if (this.age == a.age && this.sex == a.sex && this.name.equals(a.name)) {
			return true;
		}
		return false;
	}
}

class Dog extends Animal {
}

class Cat extends Animal {
}
//第2遍
class Student2 {
	String name;
	int age;
	boolean sex;
	public Student2() {
		super();
	}

	public Student2(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
//	重写toString方法 打印对象的属性值
	public String toString(){
		return  "名字："+name+" 年龄："+age+" 性别："+sex;
	}
//	重写equals方法
	public boolean equals(Object o){
//		两者是否是同一对象
		if(this == o) return true;
//		传入对象是否为空
		if(o == null) return false;
//		判断两者类型是否一致
		if(this.getClass() != o.getClass()) return false;
//		强转，判断是否相同的条件
		Student2 s = (Student2)o;
		if(this.name.equals(s.name) && this.age == s.age && this.sex == s.sex) return true;
		else return false;
	}
}
class TestStudent1{
	public static void main(String[] args){
		Student2 s1 = new Student2("mgx",22,true);
		Student2 s2 = new Student2("mgx",22,true); 
		Student2 s3 = new Student2("xiaoya",21,false);
//		打印s1 s2 s3 对象的所有属性值
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//		判断this 与 传入类型内容是否相等
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	}
}
//第3遍
class Person{
	String name;
	int age;
	double length;
	public Person() {
		super();
	}
	public Person(String name, int age, double length) {
		super();
		this.name = name;
		this.age = age;
		this.length = length;
	}
//	重写toString()方法
	public String toString(){
		return "name: "+name+" age: "+age+" length: "+length;
	}
//	重写equals()方法
	public boolean equals(Object o){
//		判断this 和o 是否是同一对象
		if(this == o) return true;
//		判断o是否为null
		if(o == null) return false;
//		判断this 和 o 是否是同一类型
		if(this.getClass() != o.getClass()) return false;
//		强转，设定判断条件
		Person p = (Person)o;
		if(this.name.equals(p.name) && this.age == p.age && this.length == p.length) return true;
		else return false;
	}
}
class TestPerson{
	 public static void main(String[] args) {
		Person p1 = new Person("mgx",22,176); 
		Person p2 = new Person("mgx",22,176);
		Person p3 = new Person("xiaoya",18,165);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		String s = new String("123");
		String s1 = new String("123");
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		Integer i = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i == i2);
	}
}
class TestChange1{
	public static void main(String[] args){
//		int---Integer
		int a =10;
		Integer integer1 = new Integer(a);
		Integer integer2 = Integer.valueOf(a);
//		Integer---int
		int b = integer1.intValue();
//		Integer---String
		String str1 = integer1.toString();
//		String---int
		int c = Integer.parseInt(str1);
//		int---String
		String str2 = c+"";
		String str3 = String.valueOf(c);
		String str4 = Integer.toString(a);
		System.out.println(str4);
//		String---Integer
		String str = "123";
		Integer integer3 = Integer.valueOf(str);
	}
}
class TestChange2{
	public static void main(String[] args) {
//		Integer---int
		Integer integer1 = new Integer(10);
		int a = integer1.intValue();
//		Integer---String
		String str = integer1.toString();
//		int---Integer
		int b= 10;
		Integer integer2 = new Integer(b);
//		int---String
		String str1 = b+"";
		String str2 = String.valueOf(b);
//		String---int
		int c = Integer.parseInt(str1);
//		String---Integer
		Integer integer3 = Integer.valueOf(str1);
	}
}
class TestChange3{
	public static void main(String[] args) {
//		int---Integer
		int a = 10;
		Integer integer1 = new Integer(a);
//		Integer---int
		int b = integer1.intValue();
//		int---String
		String str = b+"";
		String str2 = String.valueOf(b);
//		Integer---String
		String str3 = integer1.toString();
//		String---int
		int c = Integer.parseInt(str3);
//		String---Integer
		Integer Integer2 = Integer.valueOf(str3);
	}
}
class TestChange4{
	public static void main(String[] args) {
//		Integer---int
		Integer integer1 = new Integer(10);
		int a  = integer1.intValue();
//		int---Integer
		Integer integer2 = Integer.valueOf(a);
//		Integer---String
		String str1 = integer1.toString();
//		String---Integer
		Integer integer3 = Integer.valueOf(str1);
//		int---String
		String str2 = a+"";
		String str3 = String.valueOf(a);
//		String---int
		int b = Integer.parseInt(str3);
	}
}
class TestChange5{
	public static void main(String[] args) {
//		Integer---int
		Integer integer1 = new Integer(5);
		int a = integer1.intValue();
//		int---Integer
		Integer integer2 = Integer.valueOf(a);
//		Integer---String
		String str1 = integer2.toString();
//		String---Integer
		Integer integer3 = Integer.valueOf(str1);
//		int---String
		String str2 = a+"";
		String str3 = String.valueOf(a);
//		String---int
		int b = Integer.parseInt(str3);
	}
}
class TestInteger {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1==i2);		//false
		//自动装箱   默认使用的是Integer.valueOf(int i);
		Integer i3 = 12;
		Integer i4 = 12;
//		方法区有一个常量池，在-128~127之内 会获得缓存区的值，此时用 == 判断相等为 true
		System.out.println(i3==i4);
//		超过缓存区的范围  将会等到对象类型，此时用==判断相等为false
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5==i6);
	}
}
class TestInteger1 {
	public static void main(String[] args) {
		Students student = new Students("mgx",0);
		Students student1 = new Students("xiaoya");
		System.out.println(student);
		System.out.println(student1);
	}
}	
class Students{
	String name;
//	double score    将score赋值为0 与score的默认值相同，无法确定是否是参加考试还是真正的考了0分
//	包装类的应用：使用包装类，如果考试为0分，score 的值为0分，如果缺考则score的值为默认值null。
	Double score;
	public Students() {
		super();
	}
	public Students(String name) {
		super();
		this.name = name;
	}
	public Students(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
//	重写toString()方法，输出对象的各个属性值
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}
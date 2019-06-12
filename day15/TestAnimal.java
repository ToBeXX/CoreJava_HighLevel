package day15;

//��1��
public class TestAnimal {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
//		��ӡa1����ʱ������
		System.out.println(a1.getClass());
//		��ӡa2����ʱ������
		System.out.println(a2.getClass());
//		�ж�a1 a2��ʵ�����Ƿ���ͬ
		System.out.println(a1.getClass() == a2.getClass());// false
		Animal1 a3 = new Animal1("Dog1", 10, true);
		Animal1 a4 = new Animal1("Dog2", 1, false);
//		��ӡa3�൱�ڴ�ӡa3.toString();  Animal����д��toString()������ӡ�ö��������
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
//   ��дtoString()���� ��ӡ���������ֵ
	public String toString() {
		return name + "\t" + age + "\t" + sex;
	}

	// ��дequlas����
	public boolean equals(Object o) {
		// 1.�Ƚ������Ƿ�Ϊͬһ����
		if (this == o)
			return true;
		// 2.�ǿ��ж� �ж�o�Ƿ�Ϊnull
		if (o == null)
			return false;
		// 3.�ж�����(this��o)�����Ƿ�һ��
		if (this.getClass() != o.getClass())
			return false;
		// 4.ǿ������ת��
		Animal1 a = (Animal1) o;
		// 5.�Ƚ�����ֵ�Ƿ���ͬ
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
//��2��
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
//	��дtoString���� ��ӡ���������ֵ
	public String toString(){
		return  "���֣�"+name+" ���䣺"+age+" �Ա�"+sex;
	}
//	��дequals����
	public boolean equals(Object o){
//		�����Ƿ���ͬһ����
		if(this == o) return true;
//		��������Ƿ�Ϊ��
		if(o == null) return false;
//		�ж����������Ƿ�һ��
		if(this.getClass() != o.getClass()) return false;
//		ǿת���ж��Ƿ���ͬ������
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
//		��ӡs1 s2 s3 �������������ֵ
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//		�ж�this �� �������������Ƿ����
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	}
}
//��3��
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
//	��дtoString()����
	public String toString(){
		return "name: "+name+" age: "+age+" length: "+length;
	}
//	��дequals()����
	public boolean equals(Object o){
//		�ж�this ��o �Ƿ���ͬһ����
		if(this == o) return true;
//		�ж�o�Ƿ�Ϊnull
		if(o == null) return false;
//		�ж�this �� o �Ƿ���ͬһ����
		if(this.getClass() != o.getClass()) return false;
//		ǿת���趨�ж�����
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
		//�Զ�װ��   Ĭ��ʹ�õ���Integer.valueOf(int i);
		Integer i3 = 12;
		Integer i4 = 12;
//		��������һ�������أ���-128~127֮�� ���û�������ֵ����ʱ�� == �ж����Ϊ true
		System.out.println(i3==i4);
//		�����������ķ�Χ  ����ȵ��������ͣ���ʱ��==�ж����Ϊfalse
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
//	double score    ��score��ֵΪ0 ��score��Ĭ��ֵ��ͬ���޷�ȷ���Ƿ��ǲμӿ��Ի��������Ŀ���0��
//	��װ���Ӧ�ã�ʹ�ð�װ�࣬�������Ϊ0�֣�score ��ֵΪ0�֣����ȱ����score��ֵΪĬ��ֵnull��
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
//	��дtoString()�������������ĸ�������ֵ
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}
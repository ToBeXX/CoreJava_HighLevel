package day15;
import java.util.*;
//第一题
/*在Object类中，定义的finalize方法在垃圾回收时调用，toString()方法返回值表示该对象的String形式
equals方法作为为判断两个对象内容是否相同，getClass方法作用为返回对象的真实内容。*/
//第二题
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
//第三题
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
//第四题
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
//第五题
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
		return "姓名："+name+";年龄："+age;
	}
}
//第7题
class TestInt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = Integer.parseInt(str);
		Integer i = new Integer(str);
		Integer i1 = Integer.valueOf(str);
		int b = i.intValue();
		System.out.println(a);
		System.out.println(b);
	}
}
//第8题
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
			Student stu1 = new Student("Tom",18);
			System.out.println(stu1+""+100);
		}
	}
}
/*
 * 100 + " " +stu1
 * stu1+ " " + 100
 * " " + stu1a +100
 */
//第9题
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
//第10题
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
				System.out.println("发红光");
			}
		}
		RedLight redLight = new RedLight();
		lamp.on(redLight);
		//2
		Light blueLight = new Light(){
			public void shine(){
				System.out.println("发蓝光");
			}
		};
		lamp.on(blueLight);
	}
}
//第11题
class TestEmail{
	public static void main(String[] args){
		String email = "zhengcg@zparkhr.com";
		String s = "zhengcg";
		if(email.contains(s)){
			s = "zhengcg";
			System.out.println(s);
		}
		else System.out.println("没有该用户名");
	}
}
//第12题
class TestEmail1{
	public static void main(String[] args){
		String email = "zhengcg@zparkhr.com";
		if(email.contains("@") && email.contains(".")){
			if(email.lastIndexOf(".") > email.lastIndexOf("@")){
				System.out.println("合法");
			}
			else System.out.println("不合法");
		}
		else System.out.println("不合法");
	}
}
//第13题
class TestUUID{
	public static void main(String[] args){
		String u = UUID.randomUUID().toString();
		String[] a = u.split("-");
		String b = "";
		for(int i = 0;i<a.length;i++){
			b+=a[i];
		}
		System.out.println(b);
	}
}
//第14题
class TestRandom{
	public static void main(String[] args){
		Random random = new Random();
		String str = "ABCDEFGhijklmn1234567";
		char[] s = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<4;i++){
			int a = random.nextInt(s.length);
			sb.append(s[a]);
		}
		String b;
		b = sb.toString();
		System.out.println(b);
	}
}
//第15题
class CountNumber{
	public static void main(String[] args){
		String str = "1239586838923173478943890234092";
		char[] a = str.toCharArray();
		for(int i = 0;i<10;i++){
			int count = 0;
			for(int j = 0;j<a.length;j++){
				if(a[j]-'0' == i){
					count++;
				}
			
			}
			System.out.println(i+"出现了："+count+"次");
		}
	}
}
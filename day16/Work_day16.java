package day16;
import java.util.*;
//第11题
class TestEmail{
	public static void main(String[] args){
		String email = "zhengcg@zparkhr.com";
		String[] str = email.split("@");
		System.out.println("用户名为："+str[0]);
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
			int a = random.nextInt(s.length-1);
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
//假期类常用类作业
//第22题
class TestCount{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s = sc.next();
		char[] ch = s.toUpperCase().toCharArray();
		for(int i = 0;i<s.length();i++){
			if(ch[i]<='Z' && ch[i]>='A'){
				count++;
			}
		}
		System.out.println("字符串中字母有："+count+"个");
	}
}
//第24题
class TestD{
	public static void main(String[] args) {
		String s = "abcdefga";
		char[] ch = s.toCharArray();
		System.out.println(check(ch));
	}
	public static boolean check(char[] ch){
		for(int i = 0;i<ch.length-1;i++){
			for(int j = i+1;j<ch.length;j++){
				if(ch[i] == ch[j]){
					return true;
				}
			}
		}
		return false;
	}
}
//当天作业
//第1题
class TestEmail2{
	public static void main(String[] args) {
		String s = "zhangsan@163.com";
		int a = s.indexOf("@");
		String str = s.substring(0, a);
		System.out.println(str);
	}
}
//第2题
class GetFileName{
	public static void main(String[] args) {
		String s = "HelloWorld.java";
		int a = s.indexOf(".");
		String str = s.substring(0,a);
		System.out.println(str);
	}
}
//第三题
class TestJudge{
	public static void main(String[] args) {
		String s = "HelloWorld.java";
		if(s.endsWith(".java")){
			System.out.println("是java文件");
		}
		else System.out.println("不是java文件");
	}
}
//第四题
class TestJudge1{
	public static void main(String[] args) {
		String s = "HelloWorld.txt";
		if(s.endsWith(".java")){
			System.out.println("是java文件");
		}
		else System.out.println("不是java文件");
	}
}
//第五题
class TestJudgeNumber{
	public static void main(String[] args) {
		String s = "gz3a";
		System.out.println("验证码为："+s);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入验证码:");
		String str = sc.next();
		if(s.toLowerCase().equals(str.toLowerCase())){
			System.out.println("验证码输入正确");
		}
		else System.out.println("验证码输入错误");
	}
}
//第六题
class TestRandom1{
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
//第七题
/*
 * Object类中的toString()方法是将对象以字符串的形式输出
 * 重写toString()方法可以自定义实现我们想要输出的对象信息
 */
/*
 * 第八题
 *Object类中的equals()方法默认为比较两个引用内容是否相同
 *而放在对象中就是判断地址是否相同
 *重写equals（）方法，可以实现我们想要判断的内容然后返回是否相同
 */
//第九题
class Person{
	private String idCard;
	private String name;
	private int age;
	private boolean sex;
	private String address;
	private String birthday;
	public Person() {
		super();
	}
	public Person(String idCard, String name, int age, boolean sex,
			String address, String birthday) {
		super();
		this.idCard = idCard;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
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
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String toString() {
		return "Person [idCard=" + idCard + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", address=" + address + ", birthday="
				+ birthday + "]";
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
class TestPerson{
	public static void main(String[] args) {
		Person[] p = {new Person("370828199902145066","刘航",53,false,"北京","19950101"),new Person("370828199902145067","刘天",23,false,"南京","19960201"),new Person("370828199602145034","胡月",18,true,"河南","19960214")};
		for(int i = 0;i<p.length;i++){
			System.out.println(p[i].toString());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个人的信息：（身份证号-姓名-性别-年龄-地址-生日");
		String str = sc.next();
		String[] ch = str.split("-");
		Person p1 = new Person();
		p1.setIdCard(ch[0]);
		p1.setName(ch[1]);
		p1.setSex(Boolean.parseBoolean(ch[2]));
		p1.setAge(Integer.parseInt(ch[2]));
		p1.setAddress(ch[3]);
		p1.setBirthday(ch[4]);
		for(int i = 0; i<p.length;i++){
			if(p[i].equals(p1)){
				System.out.println("对象相等");
			}
			else System.out.println("对象不相等");
		}
		for(int i = 0;i<p.length;i++){
			if(p[i].getName().contains("胡")){
				System.out.println(p[i].toString());
			}
		}
		System.out.println("请输入一个姓：");
		String str1 = sc.next();
		for(int i = 0;i<p.length;i++){
			if(p[i].getName().startsWith(str1)){
				System.out.println("存在有此姓的Person对象");
			}
			else System.out.println("没有此姓的对象");
		}
	}
}
//第十题
class TestReplace{
	public static void main(String[] args) {
		String s = "abc-213-gdggd";
		String str = s.replace("-", "");
		System.out.println(str);
	}
}
//第十一题
//String 类被final修饰，故不可以继承
//第十二题
class Test12{
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "abc";
		System.out.println(s == s1);
		s+="def";
		System.out.println(s);
		System.out.println(s1);
		String str01 = new String("abc");
		String str02 = new String("abc");
		System.out.println(str01 == str02);
		System.out.println(str01.equals(str02));
	}
}
/*
true
abcdef
abc
false
true
用字面值创建对象的时候，会在串池中创建对象，再有相同字符串创建对象是会指向同一串池中的字符串
字符串连接的时候会在串池中新开辟一块空间存储连接后的字符串  字符串不可变
== 判断的是是否相等  equals 判断的是内容是否相等
创建对象，引用内存的是地址。
*/
//第十三题
class TestSubString{
	public static void main(String[] args) {
		String s = "abcdef";
		System.out.println(s.substring(2, 5));
	}
}
//cde
//第十四题
/*
 * StringBuffer 是JDK1.0中的  运行效率慢 线程安全
 * StringBuilder 是JDK1.5中的  运行效率快 线程不安全
 */
//第十五题
class TestTurn{
	public static void main(String[] args){
		String str = "hello";
		char[] a = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = a.length-1;i>=0;i--){
			sb.append(a[i]);
		}
		String s = sb.toString();
		System.out.println(s);
	}
}
//第十六题
class TestGet{
	public static void main(String[] args) {
		String s = "sdhfjsdfsdfsdf";
		char[] ch = s.toCharArray();
		for(char a : ch){
			System.out.println(a);
		}
	}
}
//第十七题
class Worker{
	private String name;
	private int age;
	private double salary;
	public Worker() {
		super();
	}
	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
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
	public String toString() {
		return "Worker [名字=" + name + ", 年龄=" + age + ", 工资=" + salary
				+ "]";
	}
}
class TestWorker{
	public static void main(String[] args) {
		String s = "张三-18-18000.0";
		String[] str = s.split("-");
		Worker w = new Worker(str[0],Integer.parseInt(str[1]),Double.parseDouble(str[2]));
		System.out.println(w.toString());
	}
}
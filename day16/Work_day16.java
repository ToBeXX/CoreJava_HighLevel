package day16;
import java.util.*;
//��11��
class TestEmail{
	public static void main(String[] args){
		String email = "zhengcg@zparkhr.com";
		String[] str = email.split("@");
		System.out.println("�û���Ϊ��"+str[0]);
	}
}
//��12��
class TestEmail1{
	public static void main(String[] args){
		String email = "zhengcg@zparkhr.com";
		if(email.contains("@") && email.contains(".")){
			if(email.lastIndexOf(".") > email.lastIndexOf("@")){
				System.out.println("�Ϸ�");
			}
			else System.out.println("���Ϸ�");
		}
		else System.out.println("���Ϸ�");
	}
}
//��13��
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
//��14��
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
//��15��
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
			System.out.println(i+"�����ˣ�"+count+"��");
		}
	}
}
//�����ೣ������ҵ
//��22��
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
		System.out.println("�ַ�������ĸ�У�"+count+"��");
	}
}
//��24��
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
//������ҵ
//��1��
class TestEmail2{
	public static void main(String[] args) {
		String s = "zhangsan@163.com";
		int a = s.indexOf("@");
		String str = s.substring(0, a);
		System.out.println(str);
	}
}
//��2��
class GetFileName{
	public static void main(String[] args) {
		String s = "HelloWorld.java";
		int a = s.indexOf(".");
		String str = s.substring(0,a);
		System.out.println(str);
	}
}
//������
class TestJudge{
	public static void main(String[] args) {
		String s = "HelloWorld.java";
		if(s.endsWith(".java")){
			System.out.println("��java�ļ�");
		}
		else System.out.println("����java�ļ�");
	}
}
//������
class TestJudge1{
	public static void main(String[] args) {
		String s = "HelloWorld.txt";
		if(s.endsWith(".java")){
			System.out.println("��java�ļ�");
		}
		else System.out.println("����java�ļ�");
	}
}
//������
class TestJudgeNumber{
	public static void main(String[] args) {
		String s = "gz3a";
		System.out.println("��֤��Ϊ��"+s);
		Scanner sc = new Scanner(System.in);
		System.out.println("��������֤��:");
		String str = sc.next();
		if(s.toLowerCase().equals(str.toLowerCase())){
			System.out.println("��֤��������ȷ");
		}
		else System.out.println("��֤���������");
	}
}
//������
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
//������
/*
 * Object���е�toString()�����ǽ��������ַ�������ʽ���
 * ��дtoString()���������Զ���ʵ��������Ҫ����Ķ�����Ϣ
 */
/*
 * �ڰ���
 *Object���е�equals()����Ĭ��Ϊ�Ƚ��������������Ƿ���ͬ
 *�����ڶ����о����жϵ�ַ�Ƿ���ͬ
 *��дequals��������������ʵ��������Ҫ�жϵ�����Ȼ�󷵻��Ƿ���ͬ
 */
//�ھ���
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
		Person[] p = {new Person("370828199902145066","����",53,false,"����","19950101"),new Person("370828199902145067","����",23,false,"�Ͼ�","19960201"),new Person("370828199602145034","����",18,true,"����","19960214")};
		for(int i = 0;i<p.length;i++){
			System.out.println(p[i].toString());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���˵���Ϣ�������֤��-����-�Ա�-����-��ַ-����");
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
				System.out.println("�������");
			}
			else System.out.println("�������");
		}
		for(int i = 0;i<p.length;i++){
			if(p[i].getName().contains("��")){
				System.out.println(p[i].toString());
			}
		}
		System.out.println("������һ���գ�");
		String str1 = sc.next();
		for(int i = 0;i<p.length;i++){
			if(p[i].getName().startsWith(str1)){
				System.out.println("�����д��յ�Person����");
			}
			else System.out.println("û�д��յĶ���");
		}
	}
}
//��ʮ��
class TestReplace{
	public static void main(String[] args) {
		String s = "abc-213-gdggd";
		String str = s.replace("-", "");
		System.out.println(str);
	}
}
//��ʮһ��
//String �౻final���Σ��ʲ����Լ̳�
//��ʮ����
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
������ֵ���������ʱ�򣬻��ڴ����д�������������ͬ�ַ������������ǻ�ָ��ͬһ�����е��ַ���
�ַ������ӵ�ʱ����ڴ������¿���һ��ռ�洢���Ӻ���ַ���  �ַ������ɱ�
== �жϵ����Ƿ����  equals �жϵ��������Ƿ����
�������������ڴ���ǵ�ַ��
*/
//��ʮ����
class TestSubString{
	public static void main(String[] args) {
		String s = "abcdef";
		System.out.println(s.substring(2, 5));
	}
}
//cde
//��ʮ����
/*
 * StringBuffer ��JDK1.0�е�  ����Ч���� �̰߳�ȫ
 * StringBuilder ��JDK1.5�е�  ����Ч�ʿ� �̲߳���ȫ
 */
//��ʮ����
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
//��ʮ����
class TestGet{
	public static void main(String[] args) {
		String s = "sdhfjsdfsdfsdf";
		char[] ch = s.toCharArray();
		for(char a : ch){
			System.out.println(a);
		}
	}
}
//��ʮ����
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
		return "Worker [����=" + name + ", ����=" + age + ", ����=" + salary
				+ "]";
	}
}
class TestWorker{
	public static void main(String[] args) {
		String s = "����-18-18000.0";
		String[] str = s.split("-");
		Worker w = new Worker(str[0],Integer.parseInt(str[1]),Double.parseDouble(str[2]));
		System.out.println(w.toString());
	}
}
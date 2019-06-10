package holiday2;
/*
 * ��һ��
 * ѡ��B
 * �����ܷ���ʸ�������Ժͷ�����Ҫ���������Ժͷ����ķ������η�
 */
/*
 * �ڶ���
 * private:˽�е�ֻ�����ڸ����з��ʣ����ܼ̳�
 * default:����+ͬ��
 * pritected:����+ͬ��+��ͬ������
 * public:����
 */
/*
 * ��3��
 * �������ǣ�����ֵ���� ������ �����б���ͬ���������η���ͬ�����
 */
/*
 * ��4��
 * һ������ֻ����һ��ֱ�ӵĸ��࣬һ����������ж��ֱ�ӵ����࣬��Ϊjava�ǵ��̳�
 */
//��5��
class Super{
	public Super(){
		System.out.println("Super()");
	}
	public Super(String str){
		System.out.println("Super(String)");
	}
}
class Sub extends Super{
	public Sub(){
		System.out.println("Sub()");
	}
	public Sub(int i){
		System.out.println("Sub(int)");
	}
	public Sub(String str){
		super(str);
		System.out.println("Sub(String)");
	}
}
class TestSuperSub{
	public static void main(String[] args){
		Sub s1 = new Sub();
		Sub s2 = new Sub(10);
		Sub s3 = new Sub("hello");
	}
}
/*
������Ϊ
Super()
Sub()
Super()
Sub(int)
Super(String)
Sub(String)
*/
//��6��
class SuperA{
//	����в��޲εĹ��췽��
	public SuperA(){}
	public SuperA(String str){}
}
class SubA extends SuperA{
	public SubA(){}
	public SubA(String str){
		super(str);
	}
}
//��7��
class Super1{
	public void m1(){
		System.out.println("m1() in Super" );
	}
	public void m2(){
		System.out.println("m2() in Super" );
	}
}
class Sub1 extends Super1{
	public void m1(){
		System.out.println("m1() in Sub");
		super.m1();
	}
}
class TestSuperSub1{
	public static void main(String args[]){
		Sub1 s = new Sub1();
		s.m1();
		s.m2();
	}
}
/*
��ӡ���Ϊ
m1() in Sub
m1() in Super
m2() in Super
*/
//��8��
class Super2{
	public void method(){
		System.out.println("method() in Super");
	}
	public void method(int i ){
		System.out.println("method(int) in Super");
	}
	public void method (String str){
		System.out.println("method(String) in Super");
	}
}
class Sub2 extends Super2{
	public void method(){
		System.out.println("method() in Sub");
	}
	public void method (String str){
		System.out.println("method(String) in Sub");
	}
}
class TestSuperSub2{
	public static void main(String[] args){
		Super2 s = new Sub2();
		s.method(10);
		s.method();
		s.method("hello");
	}
}
/*
���벻ͨ��
��Ϊ��s����method��String str��  �縸���л��Ҳ������ʵķ��� Ȼ�󱨴�
�޸ķ�����  �ڸ�������Ӳ�����Ϊ�ַ������в�method����
*/

//��9��
class Super3{
	public void m(){
		System.out.println("m()in Super3");
	}
}
class Sub3 extends Super3{
	public void m(){
		System.out.println("m()in Sub3");
	}
}
class TestSuperSub3{
	public static void foo(Super3 s){
		s.m();
	}
	public static void main(String[] args){
		Sub3 sub = new Sub3();
		Super3 sup = new Super3();
		foo(sup);
		foo(sub);
	}
}
/*
m()in Super3
m()in Sub3
*/
/*
 * ��10��
 * ѡ��DE
 */
//��11�� ������������
//��12��
class Super12{
	int method(){
		return 0;
	}
}
class Sub12 extends Super12{
	/*public int method(){
		return 0;
	}��ȷ*/
//	void method(){}���� �޷�����
//	void method(int n){} ��ȷ  ���ɷ�������
//	protected void method(){} ����  �޷���ɸ���
}
//��13��
class Meal{
	public Meal(){
		System.out.println("Meal()");
	}
}
class Lunch extends Meal{
	public Lunch(){
		System.out.println("Lunch()");
	}
}
class Vegetable {
	public Vegetable(){
		System.out.println("Vegetable()");
	}
}
class Potato extends Vegetable{
	public Potato(){
		System.out.println("Potato()");
	}
}
class Tomato extends Vegetable{
	public Tomato(){
		System.out.println("Tomato()");
	}
}
class Meat{
	public Meat(){
		System.out.println("Meat()");
	}
}
class Sandwich extends Lunch{
	Potato p = new Potato();
	Meat m = new Meat();
	Tomato t = new Tomato();
	public Sandwich(){
		System.out.println("Sandwich()");
	}
}
class TestSandwich{
	public static void main(String args[]){
		Sandwich s = new Sandwich();
	}
}
/*
Meal()
Lunch()
Vegetable()
Potato()
Meat()
Vegetable()
Tomato()
Sandwich()
*/
//��14��
//��15��
//��16��
class Dog{
	private String name;
	private int age;
	private boolean sex;
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
	public Dog(){}
	public Dog(String name,int age,boolean sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
}
class TestDog{
	public static void main(String[] args){
		Dog d = new Dog("С����",2,false);
		System.out.println("���֣�"+d.getName());
		System.out.println("���䣺"+d.getAge());
		System.out.println("�Ա�"+d.isSex());
	}
}
//��17��
class User{
	private String id;
	private String passWord;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(){}
	public User(String id,String passWord){
		this.id = id+"@zparkhr.com.cn";
		this.passWord = passWord;
	}
	public User(String id,String passWord,String email){
		this(id,passWord);
		this.email = email;
	}
}
class TestUser{
	public static void main(String[] args){
		User u2 = new User("xiaoya","1234567","1138388195@163.com");
		System.out.println("���֣�"+u2.getId());
		System.out.println("���룺"+u2.getPassWord());
		System.out.println("���䣺"+u2.getEmail());
	}
}
//��18��
class Book{
	private String title;
	private int pagNum = 200;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPagNum() {
		if(pagNum>200){
			return pagNum;
		}
		else {
			System.out.println("������Ϣ");
		}
		return 0;
		
	}
	public void setPagNum(int pagNum) {
		this.pagNum = pagNum;
	}
	public Book(String title, int pagNum) {
		super();
		this.title = title;
		this.pagNum = pagNum;
	}
}
class TestBook{
	public static void main(String[] args){
		Book book = new Book("һǧ��һҹ",800);
		Book book1 = new Book("ͯ������",190);
		System.out.println("title:"+book.getTitle());
		System.out.println("ҳ��:"+book.getPagNum());
		System.out.println("title:"+book1.getTitle());
		System.out.println("ҳ��:"+book1.getPagNum());
	}
}
//��19��
class Student{
	private String name;
	private int age;
	private String address;
	private String zipCode;
	private String mobile;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Student(){}
	public Student(String name, int age, String address, String zipCode,
			String mobile) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.zipCode = zipCode;
		this.mobile = mobile;
	}
	public String getPostAddress(){
		return "address:"+address+" zipCode:"+zipCode;
	}
}
class TestStudent{
	public static void main(String[] args){
		Student s = new Student("magengxu",22,"changyuan","453400","99899");
		System.out.println(s.getPostAddress());
	}
}
//��20 21��
class Person{
	private String name;
	private String number;
	private int age;
	private String country;
	public void eat(){}
	public void sleep(){}
	public void work(){}
	public Person(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Person(String name, String number, int age, String country) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.country = country;
	}
}
class Student1 extends Person{
	private String school;
	private String scNumber;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getScNumber() {
		return scNumber;
	}
	public void setScNumber(String scNumber) {
		this.scNumber = scNumber;
	}
	public void work(){
		System.out.println("ѧϰ");
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, String number, int age, String country,String school, String scNumber) {
		super(name, number, age, country);
		this.school = school;
		this.scNumber = scNumber;
	}
}
class Worker extends Person{
	private String enterprise;
	private int workYear;
	
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	public int getWorkYear() {
		return workYear;
	}
	public void setWorkYear(int workYear) {
		this.workYear = workYear;
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("���˹���");
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(String name, String number, int age, String country,String enterprise,int workYear) {
		super(name, number, age, country);
		// TODO Auto-generated constructor stub
		this.enterprise = enterprise;
		this.workYear = workYear;
	}
}
class StudentManger extends Student1{
	private String zhiwu;
	
	public String getZhiwu() {
		return zhiwu;
	}
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	public void talk(){
		System.out.println("����");
	}
	public StudentManger(String name, String number, int age, String country,
			String school, String scNumber,String zhiwu) {
		super(name, number, age, country, school, scNumber);
		// TODO Auto-generated constructor stub
		this.zhiwu = zhiwu;
	}
	public StudentManger() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
class TestPerson{
	public static void main(String[] args){
		Student1 s = new Student1("mgx","111",22,"China","baizhi","1904");
		Worker w = new Worker("mgx","111",22,"China","bz",3);
		StudentManger s1 = new StudentManger("mgx","111",22,"China","baizhi","1904","ѧ������ϯ");
		Person[] p = new Person[]{new Student1("mgx","111",22,"China","baizhi","1904"),new Worker("mgx","111",22,"China","bz",3),new StudentManger("mgx","111",22,"China","baizhi","1904","ѧ������ϯ")};
		int count = 0;
		for(int i = 0;i<p.length;i++){
			if(p[i] instanceof StudentManger){
				count++;
			}
		}
		System.out.println("ѧ���ɲ��У�"+count+"��");
	}
}

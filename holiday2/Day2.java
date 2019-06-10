package holiday2;
/*
 * 第一题
 * 选择B
 * 子类能否访问父类的属性和方法还要看父类属性和方法的访问修饰符
 */
/*
 * 第二题
 * private:私有的只允许在父类中访问，不能继承
 * default:本类+同包
 * pritected:本类+同包+不同包子类
 * public:公开
 */
/*
 * 第3题
 * 方法覆盖：返回值类型 方法名 参数列表相同，访问修饰符相同或更宽
 */
/*
 * 第4题
 * 一个子类只能有一个直接的父类，一个父类可以有多个直接的子类，因为java是单继承
 */
//第5题
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
输出结果为
Super()
Sub()
Super()
Sub(int)
Super(String)
Sub(String)
*/
//第6题
class SuperA{
//	添加有参无参的构造方法
	public SuperA(){}
	public SuperA(String str){}
}
class SubA extends SuperA{
	public SubA(){}
	public SubA(String str){
		super(str);
	}
}
//第7题
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
打印结果为
m1() in Sub
m1() in Super
m2() in Super
*/
//第8题
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
编译不通过
因为当s调用method（String str）  早父类中会找不到合适的方法 然后报错
修改方法是  在父类中添加参数表为字符串的有参method方法
*/

//第9题
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
 * 第10题
 * 选择DE
 */
//第11题 见另外两个包
//第12题
class Super12{
	int method(){
		return 0;
	}
}
class Sub12 extends Super12{
	/*public int method(){
		return 0;
	}正确*/
//	void method(){}错误 无法覆盖
//	void method(int n){} 正确  构成方法重载
//	protected void method(){} 错误  无法完成覆盖
}
//第13题
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
//第14题
//第15题
//第16题
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
		Dog d = new Dog("小西瓜",2,false);
		System.out.println("名字："+d.getName());
		System.out.println("年龄："+d.getAge());
		System.out.println("性别："+d.isSex());
	}
}
//的17题
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
		System.out.println("名字："+u2.getId());
		System.out.println("密码："+u2.getPassWord());
		System.out.println("邮箱："+u2.getEmail());
	}
}
//第18题
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
			System.out.println("错误信息");
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
		Book book = new Book("一千零一夜",800);
		Book book1 = new Book("童话故事",190);
		System.out.println("title:"+book.getTitle());
		System.out.println("页数:"+book.getPagNum());
		System.out.println("title:"+book1.getTitle());
		System.out.println("页数:"+book1.getPagNum());
	}
}
//第19题
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
//第20 21题
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
		System.out.println("学习");
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
		System.out.println("工人工作");
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
		System.out.println("开会");
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
		StudentManger s1 = new StudentManger("mgx","111",22,"China","baizhi","1904","学生会主席");
		Person[] p = new Person[]{new Student1("mgx","111",22,"China","baizhi","1904"),new Worker("mgx","111",22,"China","bz",3),new StudentManger("mgx","111",22,"China","baizhi","1904","学生会主席")};
		int count = 0;
		for(int i = 0;i<p.length;i++){
			if(p[i] instanceof StudentManger){
				count++;
			}
		}
		System.out.println("学生干部有："+count+"个");
	}
}

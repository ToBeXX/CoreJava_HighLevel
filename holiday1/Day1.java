package holiday1;
//第一题
/*
 选C 基于一个类可以创建该类的无数个对象
 */
/*第2题
选C 用类创建对象时 属性会存储到堆空间
作用范围不是从创建开始到定义他的代码块开始
那是局部变量。
*/
/*第3题
选D 参数表不同
 */
/*第4题
选择D 参数列表相同 构不成重载
*/
/*
第5题
*/
class ClassA{
	public  void method(int value){
		//此处value将会打印实参传给形参的value的值
		System.out.println(value);
	}
	public  void method(){
//		默认打印this.value 打印成员变量value的值
		System.out.println(value);
	}
	int value;
}
class TestClassA{
	public static void main(String[] args){
		ClassA classA = new ClassA();
		classA.value = 10;
//		打印10
		classA.method();
//		打印20
		classA.method(20);
	}
}
/*
编译通过
打印：10 20
*/
/*
 * 第6题
 * 选择B 构造方法没有返回值类型 所有也没有void  void表示返回空值
 */
/*
 * 第7题
 * 构造方法只会在创建对象的时候调用一次
 */
/*
 * 第8题 
 * class ClassA{
 * 	public void ClassA(String str){}
 * 	public void method(){}
 * }
 * 选择 C D
 */
//第9题
class MyClass{
	int value;
}
class TestRef{
	public static void main(String[] args){
		int a = 10;
		int b = a;
		b++;
		System.out.println(a);
		MyClass mc1 = new MyClass();
		mc1.value = 10;
		MyClass mc2 = mc1;
		mc2.value++;
		System.out.println(mc1.value);
	}
}
//打印  10 11
//第10题
class ClassB{
	int value = 10;
}
class TestClassB{
	public static void main(String[] args){
		ClassB c1 = new ClassB();
//		changValue(c1);
		System.out.println(changValue(c1));
		System.out.println(c1.value);
	}
	public static int changValue(ClassB c){
		c = new ClassB();
		c.value = 30;
		return c.value;
	}
}
//编译通过 运行结果为 30  10
//第11题
class ClassC{
	public ClassC(){
		System.out.println("ClassC()");
	}
}
class ClassD{
	public ClassD(){
		System.out.println("ClassD()");
	}
	public ClassD(int a){
		this();
		System.out.println("ClassD()");
	}
}
class ClassE{
	ClassC c = new ClassC();
	ClassD d;
	public ClassE(){
		System.out.println("ClassE()");
		d = new ClassD();
	}
}
class TestConstructor{
	public static void main(String arg[]){
		ClassE ee = new ClassE();
	}
}
/*
 * ClassC();
 * ClassE();
 * ClassD();
 */
/*
 * 第12题
 * this代表的是当前对象
 * this.还能用到方法中
 * this()只能应用到构造方法中
 * this()只能放在构造方法的有效代码行的第一句
 */
//第13题
class Dog{
	//定义一个name属性，该属性为String类型
	String name;
	//定义一个age属性，该属性为int类型
	int age;
	//定义一个sexual属性，该属性为boolean类型
	//true表示公，false表示母
	boolean sexual;
	public Dog(){
		
	}
	public Dog(String name ,int age,boolean sexual){
		//分别根据参数，设置Dog类的属性
		this.name = name;
		this.age = age;
		this.sexual = sexual;
	}
	public void play(){
		System.out.println("宠物狗");
	}
	public void play(int n){
		System.out.println(name+" 玩了"+" "+n+" 分钟");
	}
}
class TestDog{
	public static void main(String[] args){
		Dog d;
		//创建一个Dog对象，调用有参数的构造方法
		//名字为joy，年龄为2岁，性别为母
		d = new Dog("joy",2,false);
		//调用Dog对象的play方法
		d.play();
		//调用Dog对象的有参的play方法，参数为30
		d.play(30);
	}
}
//第14题
class Vehicles{
	String brand;
	String color;
	public void run(){
		System.out.println("我已经开动了");
	}
	public void shouInfo(){
		System.out.println(brand+" "+color);
	}
	public Vehicles(String brand,String color){
		this.brand = brand;
		this.color = color;
		
	}
	public Vehicles(){}
}
class TestCar{
	public static void main(String[] args){
		Vehicles v = new Vehicles("奔驰大G","黑色");
		v.shouInfo();
	}
}
//第15题
class Number{
	int v1;
	int v2;
	public Number(){}
	public Number(int v1,int v2){
		this.v1 = v1;
		this.v2 = v2;
	}
	public int add(){
		return v1+v2;
	}
	public int subtration(){
		return v1-v2;
	}
	public int multip(){
		return v1*v2;
	}
	public double division(){
		return v1/v2;
	}
}
class TestNumber{
	public static void main(String[] args){
		Number n = new Number(7,3);
		System.out.println(n.add());
		System.out.println(n.division());
		System.out.println(n.multip());
		System.out.println(n.subtration());
	}
}
//第16题
class User{
	String id;
	String passWord;
	String email;
	public User(){}
	public User(String id,String passWord){
		this.id = id+"@zparkhr.com.cn";
		this.passWord = passWord;
	}
	public User(String id,String passWord,String email){
		this(id,passWord);
		this.email = email;
	}
	public void show(){
		System.out.println("用户名："+id+" 密码为：xxx "+"邮箱为："+email);
	}
}
class TestUser{
	public static void main(String[] args){
		User u1 = new User("mgx","123456");
		User u2 = new User("xiaoya","1234567","1138388195@163.com");
		u1.show();
		u2.show();
	}
}
//第17题
class Worker{
	String name;
	int age;
	double salary;
	Address address;
	public Worker(){}
	public Worker(String name,int age,double salary,Address address){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	public void worker(){
		
	}
	public void showInfo(){
		System.out.println(name+"，年龄："+age+"岁，工资："+salary+"元，地址："+address.addr+"，邮编："+address.zipCode);
	}
	public void worker(int hours){
		System.out.println(name+"工作了"+hours+"小时");
	}
}
class Address{
	String addr;
	String zipCode;
	public Address(){}
	public Address(String addr,String zipCode){
		this.addr = addr;
		this.zipCode = zipCode;
	}
}
class TestWorker{
	public static void main(String[] args){
		Address a = new Address("北京市海淀区清华园1号院","100010");
		Worker w = new Worker("张三",26,10000.0,a);
		w.showInfo();
	}
}
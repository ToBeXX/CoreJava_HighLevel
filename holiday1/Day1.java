package holiday1;
//��һ��
/*
 ѡC ����һ������Դ������������������
 */
/*��2��
ѡC ���ഴ������ʱ ���Ի�洢���ѿռ�
���÷�Χ���ǴӴ�����ʼ���������Ĵ���鿪ʼ
���Ǿֲ�������
*/
/*��3��
ѡD ������ͬ
 */
/*��4��
ѡ��D �����б���ͬ ����������
*/
/*
��5��
*/
class ClassA{
	public  void method(int value){
		//�˴�value�����ӡʵ�δ����βε�value��ֵ
		System.out.println(value);
	}
	public  void method(){
//		Ĭ�ϴ�ӡthis.value ��ӡ��Ա����value��ֵ
		System.out.println(value);
	}
	int value;
}
class TestClassA{
	public static void main(String[] args){
		ClassA classA = new ClassA();
		classA.value = 10;
//		��ӡ10
		classA.method();
//		��ӡ20
		classA.method(20);
	}
}
/*
����ͨ��
��ӡ��10 20
*/
/*
 * ��6��
 * ѡ��B ���췽��û�з���ֵ���� ����Ҳû��void  void��ʾ���ؿ�ֵ
 */
/*
 * ��7��
 * ���췽��ֻ���ڴ��������ʱ�����һ��
 */
/*
 * ��8�� 
 * class ClassA{
 * 	public void ClassA(String str){}
 * 	public void method(){}
 * }
 * ѡ�� C D
 */
//��9��
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
//��ӡ  10 11
//��10��
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
//����ͨ�� ���н��Ϊ 30  10
//��11��
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
 * ��12��
 * this������ǵ�ǰ����
 * this.�����õ�������
 * this()ֻ��Ӧ�õ����췽����
 * this()ֻ�ܷ��ڹ��췽������Ч�����еĵ�һ��
 */
//��13��
class Dog{
	//����һ��name���ԣ�������ΪString����
	String name;
	//����һ��age���ԣ�������Ϊint����
	int age;
	//����һ��sexual���ԣ�������Ϊboolean����
	//true��ʾ����false��ʾĸ
	boolean sexual;
	public Dog(){
		
	}
	public Dog(String name ,int age,boolean sexual){
		//�ֱ���ݲ���������Dog�������
		this.name = name;
		this.age = age;
		this.sexual = sexual;
	}
	public void play(){
		System.out.println("���ﹷ");
	}
	public void play(int n){
		System.out.println(name+" ����"+" "+n+" ����");
	}
}
class TestDog{
	public static void main(String[] args){
		Dog d;
		//����һ��Dog���󣬵����в����Ĺ��췽��
		//����Ϊjoy������Ϊ2�꣬�Ա�Ϊĸ
		d = new Dog("joy",2,false);
		//����Dog�����play����
		d.play();
		//����Dog������вε�play����������Ϊ30
		d.play(30);
	}
}
//��14��
class Vehicles{
	String brand;
	String color;
	public void run(){
		System.out.println("���Ѿ�������");
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
		Vehicles v = new Vehicles("���۴�G","��ɫ");
		v.shouInfo();
	}
}
//��15��
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
//��16��
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
		System.out.println("�û�����"+id+" ����Ϊ��xxx "+"����Ϊ��"+email);
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
//��17��
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
		System.out.println(name+"�����䣺"+age+"�꣬���ʣ�"+salary+"Ԫ����ַ��"+address.addr+"���ʱࣺ"+address.zipCode);
	}
	public void worker(int hours){
		System.out.println(name+"������"+hours+"Сʱ");
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
		Address a = new Address("�����к������廪԰1��Ժ","100010");
		Worker w = new Worker("����",26,10000.0,a);
		w.showInfo();
	}
}
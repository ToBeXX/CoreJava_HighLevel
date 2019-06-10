package holiday3;
import java.util.*;
//�������η�
//��15��
/*F
 * T
 * T
 * F
 * T
 * T
 * F
 * T
 * F
 * T
 * T
 * T
 */
//��16��
abstract class Shape{
	public abstract double area();
	public abstract double girth();
}
class Circle extends Shape{
	double radius;
	public double area(){
		return 3.14*radius*radius;
	}
	public double girth(){
		return 3.14*2*radius;
	}
}
class Rect extends Shape{
	double length;
	double width;
	public double area(){
		return (length+width)*2;
	}
	public double girth(){
		return length+width;
	}
}
class Square extends Shape{
	double length;
	public double area(){
		return length*length;
	}
	public double girth(){
		return length*4;
	}
}
//��17��
class MyClass4{
	static int count = 0;
	public MyClass4(){
		count++;
	}
}
class TestCount{
	public static void main(String[] args){
		MyClass4 a1 = new MyClass4();
		MyClass4 a2 = new MyClass4();
		MyClass4 a3 = new MyClass4();
		MyClass4 a4 = new MyClass4();
		MyClass4 a5 = new MyClass4();
		System.out.println(MyClass4.count);
	}
}
//�ӿ�
//��1��
/*
����������й��췽�����ӿ�û�й��췽��
�ӿںͳ����඼������
�ӿ��� �����зǳ��󷽷����ӿ��ж��ǳ��󷽷�
������ͽӿڶ����ܴ�������
һ���������Լ̳�һ�������࣬���ǿ���ʵ�ֶ���ӿ�
*/
//��2��
/*һ��java�����ʵ�ֶ���ӿ�
 * һ��java����ͬʱʵ��һ���ӿڼ̳�һ����
 * һ��java���ܹ�ʵ�ֶ���ӿ�
 * һ��java��ֻ��һ��ֱ�Ӹ���
 */
//��3��
interface IA1{
	void m1();
	int a = 100;
}
class MyClass implements IA1{
	//���public ��Ϊ�ӿ��еķ���Ĭ��Ϊ���������
	public void m1(){}  
}
class TestInterface{
	public static void main(String[] args){
		IA1 ia = new MyClass();
		ia.m1();
		//��ӡ��100����Ϊ�ӿ��е����ԣ�Ĭ��Ϊ������̬����
		System.out.println(IA1.a);
	}
}
//��4��
interface IA2{
	void m1();
	void m2();
}
abstract class MyClass2 implements IA2{
	public void m1(){}
}
class MyClassB extends MyClass2{
	public void m2(){}
}
//��5��
interface IA{
	void ma();
}
interface IB extends IA{
	void mb();
}
interface IC{
	void mc();
}
interface ID extends IB,IC{
	void md();
}
class ClassE implements ID{
	public void ma(){
		System.out.println("ma()");
	}
	public void mb(){
		System.out.println("mb()");
	}
	public void mc(){
		System.out.println("mc()");
	}
	public void md(){
		System.out.println("md()");
	}
}
class TestClassE{
	public static void main(String[] args){
		IC ic = new ClassE();
		IB ib = (IB)ic;
		ib.ma();
		ib.mb();
		ic.mc();
		ID id = (ID)ic;
		id.md();
	}
}
//��6��
interface IA4{
	void ma();
}
interface IB4{
	void mb();
}
class MySuper implements IA4{
	public void ma(){}
}
class MySub extends MySuper implements IB4{
	public void mb(){}
}
class TestMain4{
	public static void main(String[] args){
		MySuper ms = new MySub();
		System.out.println(ms instanceof IA4);
		System.out.println(ms instanceof IB4);
		System.out.println(ms instanceof MySuper);
		System.out.println(ms instanceof MySub);
	}
}
/*
true
true
true
true
*/
//��7��
interface Light{
	void shine();
}
class ReadLight implements Light{
	public void shine(){
		System.out.println("Red Light shine in Red");
	}
}
class YellowLight implements Light{
	public void shine(){
		System.out.println("Yellow Light shine in Yellow");
	}
}
class GreenLight implements Light{
	public void shine(){
		System.out.println("Green Light shine in Green");
	}
}
class Lamp{
	private Light light;
	public void setLight(Light light){
		this.light = light;
	}
	public void on(){
		light.shine();
	}
}
class TestLamp{
	public static void main(String[] args){
		Light[] ls = new Light[3];
		ls[0] = new ReadLight();
		ls[1] = new YellowLight();
		ls[2] = new GreenLight();
		Lamp lamp = new Lamp();
		for(int i = 0;i<ls.length;i++){
			lamp.setLight(ls[i]);
			lamp.on();
		}
	}
}
/*
Red Light shine in Red
Yellow Light shine in Yellow
Green Light shine in Green
*/
//��8��
interface JavaTeacher{
	void teach();
}
class TeacherA implements JavaTeacher{
	public void teach(){
		System.out.println("TeacherA teach java");
	}
}
class TeacherB implements JavaTeacher{
	public void teach(){
		System.out.println("TeacherB teach java");
	}
}
class School{
	public static JavaTeacher getTeacher(int i){
		if(i == 0)return new TeacherA();
		else return new TeacherB();
	}
}
class TestTeacher{
	public static void main(String[] args){
		JavaTeacher jt = School.getTeacher(0);
		jt.teach();
		jt = School.getTeacher(10);
		jt.teach();
	}
}
/*
TeacherA teach java
TeacherB teach java
*/
//��9��
interface ServiceInterface{
	void doService1();
	void doService2();
	void doService3();
}
abstract class AbstractService implements ServiceInterface{
	public void doService1(){}
	public void doService2(){}
	public void doService3(){}
}
/*
��һ��
*/
class MyService1 implements ServiceInterface{
	public void doService1(){
		System.out.println("doService1()");
	}
	public void doService2(){
		System.out.println("doService2()");
	}
	public void doService3(){
		System.out.println("doService3()");
	}
}
/*
��2��
*/
class MyService2 extends AbstractService{
	public void doService1(){
		System.out.println("doService1()");
	}
}
/*
��һ�ַ�����ֱ��ʵ�ֽӿ�
�ڶ��ַ����Ǽ̳��Ѿ�ʵ���˽ӿڵĸ���
���𣺵�һ�ֱ��뽫�ӿ��е����г��󷽷�������ʵ�֣��ڶ��ֿ���ѡ���Եĸ����Լ���Ҫ���ǵķ���������ʧȥ��Ψһ��һ�μ̳еĻ��ᡣ
AbstractService��������ṩ�˶���ѡ�񣬲���ʵ�ֽӿ��е�ȫ������Ҳ��ʵ�ָù��ܡ�
*/
//��10��
abstract class Animal{
	public abstract void eat();
}
interface Pet{
	void play();
}
class Dog extends Animal implements Pet{
	public void eat(){
		System.out.println("Dog eat bones");
	}
	public void play(){
		System.out.println("Play with Dog");
	}
}
class Cat extends Animal implements Pet{
	public void eat(){
		System.out.println("Cat eat fish");
	}
	public void play(){
		System.out.println("Play with Cat");
	}
} 
class Wolf extends Animal{
	public void eat(){
		System.out.println("Wolf eat meat");
	}
}
class TestAnimal{
	public static void main(String[] args){
		Animal[] as = new Animal[3];
		as[0] = new Dog();
		as[1] = new Cat();
		as[2] = new Wolf();
		for(int i = 0;i<as.length;i++){
			if(as[i] instanceof Animal){
				as[i].eat();
			}
		}
		int count = 0;
		for(int i = 0;i<as.length;i++){
			if(as[i] instanceof Pet){
				count++;
				Pet p = (Pet)as[i];
				p.play();
			}
		}
		System.out.println("�����У�"+count+"��");
	}
}
//��11��
interface MathTool{
	long fact(int m);
	long intPower(int m,int n);
	boolean findFactor(int m,int n);
}
class Math implements MathTool{
	@Override
	public long fact(int m) {
		// TODO Auto-generated method stub
		int n = 1;
		if(m == 0) return 0;
		else{
			for(int i = 1;i<=m;i++){
				n*=i;
			}
		}  return n;
	}

	@Override
	public long intPower(int m, int n) {
		// TODO Auto-generated method stub
		int a = m;
		int sum = 1;
		if(n == 0) return 1;
		else{
			for(int i = 1;i<=n;i++){
				sum*=a;
			}
		} return sum;
	}

	@Override
	public boolean findFactor(int m, int n) {
		// TODO Auto-generated method stub
		if(m+n >100)return true;
		else return false;
	}
}
class TestMathTool{
	public static void main(String[] args){
		MathTool math = new Math();
		long a = math.fact(8);
		boolean b = math.findFactor(46, 89);
		long c = math.intPower(4, 3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
//��12��
interface Prime{
	boolean isPrime(int n);
}
class IsPrime implements Prime{

	@Override
	public boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n<2)return false;
		int count = 0;
		for(int i = 2;i<n;i++){
			if(n%i != 0){
				count++;
			}
		}
		if(count == n-2) return true;
		else return false;
	}
	
}
class TestGeGuess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		IsPrime  judge = new IsPrime();
		System.out.println("������һ������6��ż����");
		int number = sc.nextInt();
		for(int i = 1;i<number/2;i++){
			int num1 = i;
			int num2 = number-num1;
			if(judge.isPrime(num1) && judge.isPrime(num2)){
				System.out.println(number +"= "+num1+" "+num2);
			}
		}
	}
}
//������
//��26��
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
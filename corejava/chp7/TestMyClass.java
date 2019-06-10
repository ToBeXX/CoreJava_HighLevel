package corejava.chp7;

public class TestMyClass {
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(10);
		System.out.println(mc1.getValue());//报错 value是私有的
		System.out.println(mc2.getValue());//报错value是私有的
	}
}

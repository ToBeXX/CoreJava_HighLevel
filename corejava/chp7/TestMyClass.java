package corejava.chp7;

public class TestMyClass {
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(10);
		System.out.println(mc1.getValue());//���� value��˽�е�
		System.out.println(mc2.getValue());//����value��˽�е�
	}
}

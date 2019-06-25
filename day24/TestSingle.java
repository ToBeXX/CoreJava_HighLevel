package day24;
public class TestSingle {
	public static void main(String[] args) {
		MyClass m1 = MyClass.getInstance();
		MyClass m2 = MyClass.getInstance();
		System.out.println(m1 == m2);
		MyClass1 m21 = MyClass1.getInstance();
		MyClass1 m22 = MyClass1.getInstance();
		System.out.println(m21 == m22);
		MyClass2 m31 = MyClass2.getInstance();
		MyClass2 m32 = MyClass2.getInstance();
		System.out.println(m31 == m32);
	}
}
//1.����ʽ
class MyClass{
	private static final MyClass mc = new MyClass();
	private MyClass(){}
	
	public static MyClass getInstance(){
		return mc;
	}
	
}
//2.����ʽ
class MyClass1{
	private static MyClass1 mc = null;
	private MyClass1(){}
	
	public static synchronized MyClass1 getInstance(){
		if(mc==null){
			mc = new MyClass1();
		}
		return mc;
	}
}

//3.
class MyClass2{
	private MyClass2(){}
	static class Inner{
		static final MyClass2 mc = new MyClass2();
	}
	public static MyClass2 getInstance(){
		return Inner.mc;
	}
}
//===================���ֵ���ģʽʾ������ڶ���======================
//����ʽ
class MyClass3{
//	˽�þ�̬����
	private static final MyClass3 instance = new MyClass3();
	private MyClass3(){}
// ���ù�����̬����  ����һ������
	public static MyClass3 getInstance(){
		return instance;
	}
}
//����ʽ
class MyClass4{
	private static MyClass4 instance = null;
	private MyClass4(){}
	public static MyClass4 getInstance(){
		if(instance == null) {
			instance = new MyClass4();
		}
		return instance;
	}
}
//������  ������������ŵ�
class MyClass5{
	private MyClass5(){}
	static class Inner{
		static final MyClass5 instance = new MyClass5();
	}
	public static MyClass5 getInstance(){
		return Inner.instance;
	}
}
//===================���ֵ���ģʽʾ������ڶ���======================
//����ʽ
class MyClass6{
//	˽�þ�̬����
	private static final MyClass6 instance = new MyClass6();
	private MyClass6(){}
//���ù�����̬����  ����һ������
	public static MyClass6 getInstance(){
		return instance;
	}
}
//����ʽ
class MyClass7{
//	����getInstance����ʱ�Ŵ�������
//	�������ڶ��߳��� ���������ĵ���ģʽ
	private static MyClass7 instance = null;
	private MyClass7(){}
	public static MyClass7 getInstance(){
		if(instance == null) {
			instance = new MyClass7();
		}
		return instance;
	}
}
//������  ������������ŵ�
class MyClass8{
//	�����˷��ڴ�Ҳ��֤�����ڶ��߳����������ĵ���ģʽ
	private MyClass8(){}
	static class Inner{
		static final MyClass8 instance = new MyClass8();
	}
	public static MyClass8 getInstance(){
		return Inner.instance;
	}
}












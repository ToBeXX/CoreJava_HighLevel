package corejava.temp;
import corejava.chp7.*;
/*import corejava.chp7.MyClass;

public class MySubClass extends MyClass{
	int value;
	public MySubClass(int value){
		this.value = value;
	}
}
*/
public class MySubClass{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();//���� �вι��췽��Ϊdefault���ɿ��ʹ��
		mc2.setValue(10);
		System.out.println(mc1.getValue());//���� value��˽�е�
		System.out.println(mc2.getValue());//���� value��˽�е�
	}
}

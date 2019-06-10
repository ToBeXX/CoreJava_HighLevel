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
		MyClass mc2 = new MyClass();//报错 有参构造方法为default不可跨包使用
		mc2.setValue(10);
		System.out.println(mc1.getValue());//报错 value是私有的
		System.out.println(mc2.getValue());//报错 value是私有的
	}
}

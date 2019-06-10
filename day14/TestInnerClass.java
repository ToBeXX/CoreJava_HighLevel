package day14;
class Test {
	public static void main(String[] args){
		Outer05.method().show();
	}
}

interface Inter {
	void show();
}
/*//使用局部内部类 
class Outer05 {		//外部类
	// 补齐代码  
	public static Inter method(){
		//定义一个局部内部类，实现Inter
		class MyClass implements Inter{
			public void show() {
				System.out.println("helloWolrd");
			}
		}
		return new MyClass();  //返回对象 为接口的实现的实现类
	}
}*/
class Outer05 {		//外部类
	// 补齐代码  
	public static Inter method(){
		//定义一个局部内部类，实现Inter
		return new Inter(){		//返回对象 为接口的实现的实现类
			public void show(){
				System.out.println("helloWorld");
			}
		};  
	}
}

package day14;
class Test {
	public static void main(String[] args){
		Outer05.method().show();
	}
}

interface Inter {
	void show();
}
/*//ʹ�þֲ��ڲ��� 
class Outer05 {		//�ⲿ��
	// �������  
	public static Inter method(){
		//����һ���ֲ��ڲ��࣬ʵ��Inter
		class MyClass implements Inter{
			public void show() {
				System.out.println("helloWolrd");
			}
		}
		return new MyClass();  //���ض��� Ϊ�ӿڵ�ʵ�ֵ�ʵ����
	}
}*/
class Outer05 {		//�ⲿ��
	// �������  
	public static Inter method(){
		//����һ���ֲ��ڲ��࣬ʵ��Inter
		return new Inter(){		//���ض��� Ϊ�ӿڵ�ʵ�ֵ�ʵ����
			public void show(){
				System.out.println("helloWorld");
			}
		};  
	}
}

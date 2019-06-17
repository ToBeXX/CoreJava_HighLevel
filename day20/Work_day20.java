package day20;
/*���ò���ִ�У���ν����ִ��ʱ��ʵ�Ǻ�۲���΢�۴���
��cpu����ʱ��Ƭ����ͬ���߳�  һ���̵߳�ʱ��Ƭ��������ȴ�״̬
�ȴ��ٴη���ʱ��Ƭ*/
//��2��
class Example implements Runnable{
	public void run(){
		while(true){}
	}
	public static void main(String[] args) {
		Example ex1 = new Example();
		Example ex2 = new Example();
		Example ex3 = new Example();
		ex1.run();
		ex2.run();
		ex3.run();
	}
}
//����ͨ��������һ�������е��̡߳�
//��3��
abstract class Example1 implements Runnable{
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
	}
	public void run(int limit){
		for(int x = 0;x<limit;x++){
			System.out.println(x);
		}
	}
}
/*�������ʧ�ܣ���Ϊû����ȷʵ��Runnable �ӿ�
*/
//��4��
class Example2{
	public static void main(String[] args) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("sleep");
	}
}
//�������sleep�������׳�һ����쳣����Ҫ����
//��5��
class TestCharNumberPrint{
	public static void main(String[] args) {
		Runnable task1 = new MyTask();
		Thread task2 = new MyThreadf();
		task2.start();
		Thread thread = new Thread(task1);
		thread.start();
	}
}
class MyThreadf extends Thread{
	public void run(){
		for(int i = 1;i<=100;i++){
			for(int j = 1;j<=26;j++){
				System.out.println(j+" "+i);
			}
		}
	}
}
class MyTask implements Runnable{
	public void run(){
		for(int i = 1;i<=100;i++){
			for(char c = 'A';c<='Z';c++){
				System.out.println(c+" "+i);
			}
		}
	}
}
//��6��
class MyThread1 extends Thread{
	Object lock;
	public MyThread1(Object lock){
		this.lock = lock;
	}
	public void run() {
		synchronized (lock) {//1
			for(int i = 0;i<=10;i++){
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {}
				System.out.println("$$$");
			}
		}
	}
}
class MyThread2 extends Thread{
	Object lock;
	public MyThread2(Object lock){
		this.lock = lock;
	}
	public void run() {
		synchronized (lock) {//2
			for(int i = 0;i<=10;i++){
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {}
				System.out.println("###");
			}
		}
	}
}
class TestMyThread{
	public static void main(String[] args) {
		Object lock = new Object();
		Thread t1 = new MyThread1(lock);
		Thread t2 = new MyThread2(lock);
		t1.start();
		t2.start();
	}
}
/*synchronized�ᵼ�������߳�һ������ִ����Ϻ���һ���ſ�ʼִ�У�
����synchronized $��#������ӡ��Ϣ�᲻����Ľ����ӡ*/
//��7��
class MyThreads extends Thread{
	private String data;
	public MyThreads(String data) {
		super();
		this.data = data;
	}
	public void run(){
		synchronized(data){
			for(int i = 0;i<10;i++){
				try{
					Thread.sleep((int)(Math.random()*1000));
				}catch(Exception e){}
				System.out.println(data);
			}
		}
	}
}
class TestMyThread1{
	public static void main(String[] args) {
		Thread t1 = new MyThreads("hello");
		Thread t2 = new MyThreads("world");
		t1.start();
		t2.start();
	}
}
//�̲߳�ͬ������˽������hello��world
//��8��
class MyThreade extends Thread{
	private String data;
	public MyThreade(String data) {
		super();
		this.data = data;
	}
	public void run(){
		synchronized (System.out) {
			for(int i = 0;i<10;i++){
				System.out.println(data);
			}
		}
	}
}
class TestMyThread2{
	public static void main(String[] args) {
		Thread t1 = new MyThreade("aaa");
		Thread t2 = new MyThreade("bbb");
		t1.start();
		t2.start();
	}
}
//��run�����Ĵ������synchronized (System.out) ��
//��9��
class MyThreadn implements Runnable{
	public void run(){
		for(int i = 0; i<100;i++){
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}
}
class MyThreadn1 implements Runnable{
	public void run(){
		for(int i = 0; i<100;i++){
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}
}
class TestMyThreadn{
	public static void main(String[] args) {
		Runnable t1 = new MyThreadn();
		Runnable t2 = new MyThreadn1();
		Thread t = new Thread(t1);
		Thread th = new Thread(t2);
		t.start();
		th.start();
	}
}
package day20;
public class TestThread {
	public static void main(String[] args) {
		//��������1
		Runnable task1 = new Task01();
		//Thread��   �����߳�
		//����һ���̶߳���
		Thread t1 = new Thread(task1);
		//�����߳�
		t1.start();
		Runnable task2 = new Task02();
		Thread t2 = new Thread(task2);
		t2.start();
	}
}
//����01
//ʵ��Runnable,����run����
class Task01 implements Runnable{
	public void run() {
		//ִ�е��������
		for(int i=0;i<1000;i++){
			System.out.println("#"+i);
		}
	}
}
//����02
//ʵ��Runnable,����run����
class Task02 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("$"+i);
		}
	}
}
class TestSynchronized {
	public static void main(String[] args) throws InterruptedException {
		final TestSynList list = new TestSynList();
		final Object o = new Object();
		//ʹ�ö���߳� ��ͬһ���������Ԫ��
		Thread t1 = new Thread(){
			public void run(){
				synchronized(o){
					list.add('A');
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				synchronized(o){
					list.add('B');
				}
			}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		list.print();
	}
}
//�Զ��弯����
class TestSynList{
	private Object[] os = new Object[]{' ',' ',' ',' '};
	private int size = 0;
	public void add(Object o){
		os[size] = o;
		try {
			//�õ�ǰ�߳� ��������
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		size++;
	}
//	�Զ����ӡ����
	public void print(){
		for (int i = 0; i < size; i++) {
			System.out.print(os[i]+"\t");
		}
		System.out.println();
	}
}
class TestThread1 {
	public static void main(String[] args) throws InterruptedException {
//		ʹ���Զ����task����һ������
		Runnable task = new Task();
//		����һ���߳�  �������ύ�����߳�
		Thread t1 = new Thread(task);
//		�����Զ���ĸ���run������ThreadA����һ���߳�
		Thread t2 = new ThreadA();
//		�߳�ready
		t1.start();
		t2.start();
		//��t1��t2�߳� �������߳�  
		//��������� ��ȴ�t1��t2ִ�����֮�� ��ִ��
		t1.join();
		t2.join();
//		t1 t2 �߳̽�����ź�ִ�����
		System.out.println("main---end");
	}
}
//��һ�ִ������� ----- ʵ��Runnable�ӿ�
class Task implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			if(i==51)
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("$"+i);
		}
	}
}
//�ڶ��� ---- �̳�Thread����дrun����
class ThreadA extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("#"+i);
		}
	}
}
class TestERunnable1 {
	public static void main(String[] args) {
//		����һ��Object����������
		final Object o  = new Object();
//		ʹ�������ڲ��ഴ��һ������
		Runnable task = new Runnable() {
			public void run() {
//				���o������     ʵ�ִ����ͬ��
				synchronized (o) {
//					���ɷָ��ԭ�Ӳ���
					for(int i = 1;i<=100;i++){
						System.out.println(Thread.currentThread().getName()+" Сˬ��ʦС��Ů "+i);
						o.notifyAll();
						try {
							if(i!=100) o.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		Runnable task1 = new Runnable() {
			public void run() {
				synchronized (o) {
					for(int i = 1;i<=100;i++){
						System.out.println(Thread.currentThread().getName()+" Сˬ��ʦ���� "+i);
						o.notifyAll();
						try {
							if(i!=100) o.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		 Thread t1 =new Thread(task);
		 t1.start();
		new Thread(task1).start();
		/*MyThread myThread = new MyThread();
		myThread.start();
		myThread.run();*/
	}
}
//�Զ����߳���  ����Thread��run����
class MyThreada extends Thread{
	public void run(){
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" Сˬ��ʦ���� "+i);
		}
	}
}
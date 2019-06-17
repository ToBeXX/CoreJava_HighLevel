package day20;
public class TestThread {
	public static void main(String[] args) {
		//创建任务1
		Runnable task1 = new Task01();
		//Thread类   代表线程
		//创建一个线程对象
		Thread t1 = new Thread(task1);
		//启动线程
		t1.start();
		Runnable task2 = new Task02();
		Thread t2 = new Thread(task2);
		t2.start();
	}
}
//任务01
//实现Runnable,覆盖run方法
class Task01 implements Runnable{
	public void run() {
		//执行的任务代码
		for(int i=0;i<1000;i++){
			System.out.println("#"+i);
		}
	}
}
//任务02
//实现Runnable,覆盖run方法
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
		//使用多个线程 往同一集合中添加元素
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
//自定义集合类
class TestSynList{
	private Object[] os = new Object[]{' ',' ',' ',' '};
	private int size = 0;
	public void add(Object o){
		os[size] = o;
		try {
			//让当前线程 陷入休眠
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		size++;
	}
//	自定义打印方法
	public void print(){
		for (int i = 0; i < size; i++) {
			System.out.print(os[i]+"\t");
		}
		System.out.println();
	}
}
class TestThread1 {
	public static void main(String[] args) throws InterruptedException {
//		使用自定义的task创建一个任务
		Runnable task = new Task();
//		创建一个线程  将任务提交给该线程
		Thread t1 = new Thread(task);
//		利用自定义的覆盖run方法的ThreadA创建一个线程
		Thread t2 = new ThreadA();
//		线程ready
		t1.start();
		t2.start();
		//让t1和t2线程 加入主线程  
		//则后续代码 会等待t1和t2执行完毕之后 再执行
		t1.join();
		t2.join();
//		t1 t2 线程结束后才后执行语句
		System.out.println("main---end");
	}
}
//第一种创建任务 ----- 实现Runnable接口
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
//第二种 ---- 继承Thread类重写run方法
class ThreadA extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("#"+i);
		}
	}
}
class TestERunnable1 {
	public static void main(String[] args) {
//		创建一个Object了类型引用
		final Object o  = new Object();
//		使用匿名内部类创建一个任务
		Runnable task = new Runnable() {
			public void run() {
//				获得o对象锁     实现代码块同步
				synchronized (o) {
//					不可分割的原子操作
					for(int i = 1;i<=100;i++){
						System.out.println(Thread.currentThread().getName()+" 小爽老师小仙女 "+i);
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
						System.out.println(Thread.currentThread().getName()+" 小爽老师最美 "+i);
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
//自定义线程类  覆盖Thread的run方法
class MyThreada extends Thread{
	public void run(){
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" 小爽老师最美 "+i);
		}
	}
}
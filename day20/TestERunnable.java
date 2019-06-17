package day20;
public class TestERunnable {
	public static void main(String[] args) {
		final Object o  = new Object();
		Runnable task = new Runnable() {
			public void run() {
				synchronized (o) {
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
class MyThread extends Thread{
	public void run(){
		for(int i = 0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" Сˬ��ʦ���� "+i);
		}
	}
}
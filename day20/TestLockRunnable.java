package day20;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockRunnable {
	public static void main(String[] args) {
		final Lock lock = new ReentrantLock();
		final Condition c = lock.newCondition();
		final Object o  = new Object();
		Runnable task = new Runnable() {
			public void run() {
				try {
					lock.lock();
					for(int i = 1;i<=100;i++){
						System.out.println(Thread.currentThread().getName()+" 小爽老师小仙女 "+i);
						c.signalAll();
						try {
							if(i!=100) c.await();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}finally{
					lock.unlock();
				}
			}
		};
		Runnable task1 = new Runnable() {
			public void run() {
				try {
					lock.lock();
					for(int i = 1;i<=100;i++){
						System.out.println(Thread.currentThread().getName()+" 小爽老师最美 "+i);
						c.signalAll();
						try {
							if(i!=100) c.await();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}finally{
					lock.unlock(); 
				}
			}
		};
		new Thread(task).start();
		new Thread(task1).start();
	}
}
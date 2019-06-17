package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockNumberChar {
	public static void main(String[] args) {
		final Lock lock =  new ReentrantLock();
		final Condition c1 = lock.newCondition();
		Runnable task1 = new Runnable() {
				public void run() {
					try{
					lock.lock();
					for(char c = 'A'; c<='Z';c++){
						System.out.println(c);
							try {
								c1.signalAll();
								c1.await();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				}finally{
					lock.unlock();
				}
			}
		};
		Runnable task2 = new Runnable() {
			public void run() {
				try{
				lock.lock();
				for(int i = 1;i<=26;i++){
					System.out.println(i);
						try {
							c1.signalAll();
							c1.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}finally{
				lock.unlock();
				}
			}
		};
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(task1);
		es.submit(task2);
		es.shutdown();
	}
}

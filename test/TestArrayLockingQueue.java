package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class TestArrayLockingQueue {
	public static void main(String[] args) {
		final BlockingQueue<String> queue = new ArrayBlockingQueue<>(6);  
		Runnable task1 = new Runnable() {
			public void run() {
				for(int i = 1;i<=100;i++){
					try {
						queue.put("A"+i);
						System.out.println("A"+i+" puted ");
						for(String s : queue){
							System.out.print(s+" ");
						}
						System.out.println();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable task2 = new Runnable() {
			public void run() {
				for(int i = 1;i<=100;i++){
					try {
						System.out.print(queue.take()+" taked ");
						for(String s : queue){
							System.out.println(s+" ");
						}
						System.out.println();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		new Thread(task1).start();
		new Thread(task2).start();
	}
}

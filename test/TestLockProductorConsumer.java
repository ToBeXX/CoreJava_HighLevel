package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockProductorConsumer {
	public static void main(String[] args) {
		final MyStack1 stack = new MyStack1();
		Runnable task1 = new Runnable() {
			public void run() {
				for(char c ='A';c<'Z';c++){
					stack.push(c+"");
				}
			}
		};
		Runnable task2 = new Runnable() {
			public void run() {
				for(int i = 0;i<26;i++){
					stack.pop();
				}
			}
		};
		ExecutorService  es = Executors.newFixedThreadPool(2);
		es.submit(task1);
		es.submit(task2);
		es.shutdown();
	}
}
class MyStack1{
	String[] str = {"","","","","","",""};
	int index;
	Lock lock = new ReentrantLock();
	Condition full = lock.newCondition();
	Condition empty = lock.newCondition();
	public void push(String s){
		try{
			lock.lock();
			while(str.length == index){
				try {
					full.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print(s+"  pushed  ");
			str[index] = s;
			index++;
			print();
			empty.signalAll();
			
		}finally{
			lock.unlock();
		}
	}
	public void pop(){
		try{
			lock.lock();
			while(index == 0){
				try {
					empty.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			index--;
			String s = str[index];
			str[index] = "";
			System.out.print(s+" poped ");
			print();
			full.signalAll();
		}finally{
			lock.unlock();
		}
	}
	public void print(){
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+"  ");
		}
		System.out.println();
	}
}
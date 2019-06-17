package test;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {
	public static void main(String[] args)throws Exception {
		ExecutorService es = Executors.newCachedThreadPool();
		Callable<Integer> stak1 = new Callable<Integer>() {
			public Integer call() throws Exception {
				System.out.println("task1-------start");
				int sum = 0;
				for(int i = 1;i<=100;i++){
					if(i%2 != 0){
						sum+=i;
						Thread.sleep(100);
					}
				}
				System.out.println("task1-------end");
				return sum;
			}
		};
		Callable<Integer> stak2 = new Callable<Integer>() {
			public Integer call() throws Exception {
				System.out.println("task2-------start");
				int sum = 0;
				for(int i = 2;i<=100;i+=2){
					sum +=i;
					Thread.sleep(100);
				}
				System.out.println("task2-------end");
				return sum;
			}
		};
		Future<Integer> f1 = es.submit(stak1);
		Future<Integer> f2 = es.submit(stak2);
		int sum = f1.get()+f2.get();
		System.out.println(sum);
	}
}
package day_6_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestMax {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Random r  = new Random();
		ExecutorService es = Executors.newFixedThreadPool(10);
		int[] data = new int[10000]; 
		for(int i = 0;i<data.length;i++){
			data[i] = r.nextInt(10000);
		}
		List<Future<Integer>> list = new ArrayList<>();
		for(int i = 1;i<=10;i++){
			Callable c = new Max(i,data);
			Future<Integer> f = es.submit(c);
			list.add(f);
		}
		int m = 0;
		for(Future<Integer> i : list){
			if(m<i.get()){
				m = i.get();
			}
		}
		System.out.println(m);
	}
}
class Max implements Callable{
	int n = 0;
	int max = 0;
	int[] data;
	public Max(int n,int[] data){
		this.n = n;
		this.data = data;
	}
	public Integer call() throws Exception {
		for(int i = (n-1)*1000;i<n*1000;i++){
			if(max < data[i]){
				int  temp = max;
				max = data[i];
				data[i] = temp;
			}
		}
		return max;
	}
	
}
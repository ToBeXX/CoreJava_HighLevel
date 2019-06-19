package test;
//21Ìì
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFuture {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		List<Future<Long>> list = new ArrayList<>();
		long result = 0;
		for(int i = 1;i<=10;i++){
			Callable<Long> c = new Add(i);
			Future<Long> f =  es.submit(c);
			list.add(f);
			/*try {
				result+=f.get() ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}*/
		}
		for(Future<Long> f : list){
			try {
				result+=f.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println(result);
	}
}
class Add implements Callable<Long>{
	int n;
	long result=0;
	public Add(int n) {
		super();
		this.n = n;
	}
	public Long call(){
		for(int i = (n-1)*1000+1;i<=n*1000;i++){
			result+=i;
		}
		return result;
	}
}
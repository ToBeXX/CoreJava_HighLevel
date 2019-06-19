package test;
//21天
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TestForkJoinAdd {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		ForkJoinPool pool = new ForkJoinPool();
		AddTask main = new AddTask(1, 100000);
//		启动main线程 获得返回值
		long result = pool.invoke(main);
		System.out.println(result);
	}
}
class AddTask extends RecursiveTask<Long>{
	int start;
	int end;
	static final int THRESHOLD = 5000;
	public AddTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	protected Long compute() {
//		如果end-start小于阀值，执行计算程序 
		if(end-start<=THRESHOLD){
			long result = 0;
			for(int i = start;i<=end;i++){
				result+=i;
			}
			return result;
		}
//		如果end-start大于阀值，进行分割
		else{
//			计算中间值
			int middle = (start+end)/2;
//			分割成两个线程进行计算
			AddTask task1 = new AddTask(start, middle);
			AddTask task2 = new AddTask(middle+1,end);
//			启动两个线程
			invokeAll(task1,task2);
//			join()方法获取返回值
			long r1 = task1.join();
			long r2 = task2.join();
			return r1+r2;
		}
	}
	
}
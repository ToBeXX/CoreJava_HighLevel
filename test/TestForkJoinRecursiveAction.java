package test;
//µÚ21
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class TestForkJoinRecursiveAction {
	public static void main(String[] args) {
		Random r = new Random();
		int[] data = new int[4000000] ;
		for(int i = 0;i<data.length;i++){
			data[i] = r.nextInt(4000000);
		}
		TestForkJoinSort main = new TestForkJoinSort(data,0, data.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(main);
		for(int i = 0;i<=1000;i++){
			System.out.println(data[i]);
		}
	}
}
class TestForkJoinSort extends RecursiveAction{
	int[] data;
	int start;
	int end;
	public TestForkJoinSort() {
		super();
	}
	public TestForkJoinSort(int[] data, int start, int end) {
		super();
		this.data = data;
		this.start = start;
		this.end = end;
	}
	static final int THRESHOLD = 10000;
	@Override
	protected void compute() {
		if(end-start <= THRESHOLD){
			Arrays.sort(data, start, end);
		}
		else{
			int middle = (end+start)/2;
			TestForkJoinSort task1 = new TestForkJoinSort(data, start, middle);
			TestForkJoinSort task2 = new TestForkJoinSort(data,middle,end);
			invokeAll(task1,task2);
			merge(middle);
		}
	}
	 void merge(int middle){
		int[] a = Arrays.copyOfRange(data, start, middle);
		int[] b = Arrays.copyOfRange(data, middle,end);
		int x = 0;
		int y = 0;
		for(int i = start;i<end;i++){
			if(x == a.length) data[i] = b[y++];
			else if(y == b.length) data[i] = a[x++];
			else if(a[x] > b[y]) data[i] = b[y++];
			else data[i] = a[x++];
		}
	}
}
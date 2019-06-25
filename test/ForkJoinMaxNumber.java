package test;
//21Ìì
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinMaxNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int[] data = new int[400000];
		for(int i = 0;i<data.length;i++){
			data[i] = r.nextInt(400000);
		}
		ForkJoinPool pool = new ForkJoinPool();
		JudgeMax main = new JudgeMax(data, 0, data.length);
		int result = pool.invoke(main);
		System.out.println(result);
	}
}
class JudgeMax extends RecursiveTask<Integer>{
	int[] data;
	int start;
	int end;
	static final int THRESHOLD = 1000;
	public JudgeMax(int[] data, int start, int end) {
		super();
		this.data = data;
		this.start = start;
		this.end = end;
	}
	@Override
	protected Integer compute() {
		if(end-start <= THRESHOLD){
			int max = data[start];
			for(int i = start+1;i<data.length;i++){
				if (max<data[i]) max = data[i];
			}
			return max;
		} 
		else{
			int middle = (start+end)/2;
			JudgeMax task1 = new JudgeMax(data, start, middle);
			JudgeMax task2 = new JudgeMax(data,middle,end);
			invokeAll(task1,task2);
			int r1 = task1.join();
			int r2 = task2.join();
			if(r1>r2) return r1;
			else return r2;
		}
	}
}
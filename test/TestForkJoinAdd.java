package test;
//21��
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TestForkJoinAdd {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		ForkJoinPool pool = new ForkJoinPool();
		AddTask main = new AddTask(1, 100000);
//		����main�߳� ��÷���ֵ
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
//		���end-startС�ڷ�ֵ��ִ�м������ 
		if(end-start<=THRESHOLD){
			long result = 0;
			for(int i = start;i<=end;i++){
				result+=i;
			}
			return result;
		}
//		���end-start���ڷ�ֵ�����зָ�
		else{
//			�����м�ֵ
			int middle = (start+end)/2;
//			�ָ�������߳̽��м���
			AddTask task1 = new AddTask(start, middle);
			AddTask task2 = new AddTask(middle+1,end);
//			���������߳�
			invokeAll(task1,task2);
//			join()������ȡ����ֵ
			long r1 = task1.join();
			long r2 = task2.join();
			return r1+r2;
		}
	}
	
}
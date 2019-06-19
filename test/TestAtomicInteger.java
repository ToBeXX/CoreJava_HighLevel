package test;
//21Ìì
import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {
	static AtomicInteger a = new AtomicInteger(0);
	public static void main(String[] args) {
		Thread[] ts = new Thread[10];
		for(int i = 0;i<ts.length;i++){
			ts[i] = new Thread(new Runnable() {
				public void run() {
					for(int i = 0;i<10000;i++){
						a.incrementAndGet();
					}
				}
			});
		}
		for(Thread t : ts){
			t.start();
		}
		for(Thread t : ts){
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(a);
	}
}

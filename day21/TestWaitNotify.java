package day21;
public class TestWaitNotify {
	public static void main(String[] args) {
		final Object o = new Object();
		Runnable task1 = new Runnable() {
			public void run() {
				synchronized (o) {
					for(int i =1;i<=26;i++){
						System.out.println(i);
						o.notifyAll();
						try {
							if(i!=26) o.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		Runnable task2 = new Runnable() {
			public void run() {
				synchronized (o) {
					for(char i ='A';i<='Z';i++){
						System.out.println(i);
						o.notifyAll();
						try {
							if(i!='Z') o.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		new Thread(task1).start();
		new Thread(task2).start();
	}
}

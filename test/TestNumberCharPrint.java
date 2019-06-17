package test;
public class TestNumberCharPrint {
	public static void main(String[] args) {
		final Object o = new Object();
		Runnable task1 = new Runnable() {
			public void run() {
				synchronized (o) {
					for(int i = 0;i<=52;i++){
						System.out.println(i);
						o.notifyAll();
						if(i%2 == 0){
							try {
								if(i!=52) o.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		};
		Runnable task2 = new Runnable() {
			public void run() {
				synchronized (o) {
					for(char c = 'A';c<='Z';c++){
						System.out.println(c+"");
						o.notifyAll();
						try {
							if(c!='Z') o.wait();
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
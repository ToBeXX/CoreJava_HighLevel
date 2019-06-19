package test;
//21Ìì
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public class TestSemaphore {
	public static void main(String[] args) {
		final Semaphore s = new Semaphore(5);
		final List<PhoneRoom> list = new ArrayList<>();
		list.add(new PhoneRoom("room1"));
		list.add(new PhoneRoom("room2"));
		list.add(new PhoneRoom("room3"));
		list.add(new PhoneRoom("room4"));
		list.add(new PhoneRoom("room5"));
		class Task implements Runnable{
			public void run() {
				try {
					s.acquire();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for(int i = 0;i<list.size();i++){
					PhoneRoom room = list.get(i);
					if(room.getFlag()){
						room.setBoolean(false);
						System.out.println(Thread.currentThread().getName()+" entered "+room.getName());
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+" exited "+room.getName());
						room.setBoolean(true);
						s.release();
						return;
					}
					
				}
			}
		}
		for(int i = 0;i<10;i++){
			Thread t = new Thread(new Task()) ;
			t.start();
		}
	}
}
class PhoneRoom{
	private AtomicBoolean flag = new AtomicBoolean(true);
	 private String name;
	public boolean getFlag() {
		return this.flag.get();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PhoneRoom(String name) {
		super();
		this.name = name;
	}
	public void setBoolean(boolean flag){
		this.flag.set(flag);
	} 
}

package test;
public class TestProducerConsumer {
	public static void main(String[] args){
		final MyStack ms = new MyStack();
		Runnable task1 = new Runnable(){
			public void run(){
				for(char c = 'A';c<='Z';c++){
					ms.push(c+"");
				}
			}
		};
		Runnable task2 = new Runnable(){
			public void run(){
				for(int i = 1;i<=26;i++){
					ms.pop();
				}
			}
		};
		 new Thread(task1).start();
		 new Thread(task2).start();
	}
}
class MyStack{
	String[] s = {"","","","","","",""};
	int index;
	public synchronized void push(String str){
		while(s.length == index){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(str+"  pushed  ");
		s[index] = str;
		index++;
		print();
		this.notifyAll();//通知消费者
	}
	public synchronized void pop(){
		while(index == 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		index--; 
		String str = s[index];
		s[index] = "";
		System.out.print(str+"   poped  ");
		print();
		this.notifyAll();//通知生产者
	}
	public void print(){
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+"");
		}
		System.out.println();
	}
}
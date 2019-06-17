package test;
public class TestException {
	public static void main(String[] args) {
		try {
			method(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void method(int i) throws InterruptedException{
		if(i == 1){
			System.out.println("I am fine");
		}
		else throw new InterruptedException();
	}
}

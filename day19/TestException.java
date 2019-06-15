package day19;

public class TestException {
	public static void main(String[] args) {
		Worker w = new Worker("tsj",50);
		w.work();
		w.dead();
		w.work();
	}
}
class Worker{
	String name;
	int age;
	public Worker(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void work(){
		System.out.println("worke()");
	}
	public void dead(){
		throw new RuntimeException();
	}
}
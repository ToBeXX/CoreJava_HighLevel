package day_6_22;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestDeepClone {
	public static void main(String[] args) throws IOException, CloneNotSupportedException {
		FileOutputStream fos = new FileOutputStream("fileObject/testClone.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Address a = new Address();
		Worker w = new Worker("xiaoya", 18,a);
		oos.writeObject(w);
		oos.close();
		
		FileOutputStream fos1 = new FileOutputStream("fileObject/¸±±¾_Clone.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		Worker w1 = (Worker)w.clone();
		oos1.writeObject(w1);
		oos1.close();
		System.out.println(w == w1);
		System.out.println(w.add == w1.add);
	}
}
class Worker implements Externalizable,Cloneable{
	private String name;
	private int age;
	Address add;
	public Worker(String name, int age,Address add) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
	}
	
	public Worker() {
		super();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.name);
		out.writeObject(this.age*2);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		this.name = (String)in.readObject();
		this.age = (int)in.readObject();
	}
	
}
class Address{
	
}
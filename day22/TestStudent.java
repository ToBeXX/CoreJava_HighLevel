package day22;

import java.io.Serializable;

public class TestStudent implements Serializable{
	private String name;
	//被transient修饰的属性  不参与序列化
	private transient int age;
	private Address address = new Address();
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
	
	public TestStudent() {
	}
	public TestStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
class Address implements Serializable{}


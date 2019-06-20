package day22;

import java.io.Serializable;

public class Student2 implements Serializable{
	String name;
	Integer age;
	Double score;
	Boolean sex;
	Address2 address;
	public Student2(String name, Integer age, Double score, Boolean sex,
			Address2 address) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.sex = sex;
		this.address = address;
	}
	public Student2() {
		super();
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", score=" + score
				+ ", sex=" + sex + ", address=" + " zipcode: "+address.zipCode +" addr: "+ address.addr+"]";
	}
	
}
class Address2 implements Serializable{
	String zipCode;
	String addr;
	public Address2(String zipCode, String addr) {
		super();
		this.zipCode = zipCode;
		this.addr = addr;
	}
}
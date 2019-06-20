package day22;

import java.io.Serializable;

public class Student3 implements Serializable{
	String name;
	transient Integer age;
	Double score;
	transient Boolean sex;
	transient Address3 address;
	public Student3(String name, Integer age, Double score, Boolean sex,
			Address3 address) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.sex = sex;
		this.address = address;
	}
	public Student3() {
		super();
	}
	@Override
	public String toString() {
		return "Student3 [name=" + name + ", age=" + age + ", score=" + score
				+ ", sex=" + sex + ", address=" + address+"]";
	}
}
class Address3 implements Serializable{
	String zipCode;
	String addr;
	public Address3(String zipCode, String addr) {
		super();
		this.zipCode = zipCode;
		this.addr = addr;
	}
}

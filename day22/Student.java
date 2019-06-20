package day22;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	Integer age;
	Double score;
	Boolean sex;
	Address1 address;
	public Student(String name, Integer age, Double score, Boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.sex = sex;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ ", sex=" + sex + "]";
	}
}
class Address1 implements Serializable{
	String zipCode;
	String addr;
}
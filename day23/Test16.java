package day23;
//编译时正常 运行时错误  因为Address没有序列化
import java.io.*;
public class Test16 {
	public static void main(String[] args) throws Exception{
		Address addr = new Address("beijing", "100000");
		Worker w =new Worker("Tom", 18, addr);
		OutputStream os = new FileOutputStream("fout.dat");
		ObjectOutputStream oout = new ObjectOutputStream(os);
		oout.writeObject(w);
		oout.close();
	}
}
class Address implements Serializable{
	private String addressName;
	private String zipCode;
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Address(String addressName, String zipCode) {
		super();
		this.addressName = addressName;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
	}
}
class Worker implements Serializable{
	private String name;
	private int age;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Worker(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Worker() {
		super();
	}
}
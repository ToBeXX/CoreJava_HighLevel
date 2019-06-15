package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Computer{
	private String brand;
	private String color;
	private int size;
	public Computer() {
		super();
	}
	public Computer(String brand, String color, int size) {
		super();
		this.brand = brand;
		this.color = color;
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String toString() {
		return "Computer [brand=" + brand + ", color=" + color + ", size="
				+ size + "]";
	}
}
class TestComputer{
	public static void main(String[] args) {
		List<Computer> list = new ArrayList<Computer>();
		list.add(new Computer("华硕","黑色",12));
		list.add(new Computer("戴尔","白色",11));
		list.add(new Computer("HUAWEI","蓝色",14));
		list.add(new Computer("MAC","黄色",10));
		list.add(new Computer("HUAWEI","红色",11));
		list.add(new Computer("小米","黑色",13));
		list.remove(4);
		for(Computer c : list){
			if(c.getBrand() == "HUAWEI"){
				System.out.println(c.toString());
			}
		}
		for(Computer c : list){
			if(c.getBrand() == "MAC"){
				c.setBrand("HUAWEI");
			}
		}
		for(Computer c : list){
			System.out.println(c);
		}
		list.add(3, new Computer("MAC","白色",15));
	}
}
//第二题
class Useru{
	private String name;
	private String passWorld;
	private boolean isOnline;
	private int onlineTime;
	public Useru() {
		super();
	}
	public Useru(String name, String passWorld, boolean isOnline, int onlineTime) {
		super();
		this.name = name;
		this.passWorld = passWorld;
		this.isOnline = isOnline;
		this.onlineTime = onlineTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWorld() {
		return passWorld;
	}
	public void setPassWorld(String passWorld) {
		this.passWorld = passWorld;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public int getOnlineTime() {
		return onlineTime;
	}
	public void setOnlineTime(int onlineTime) {
		this.onlineTime = onlineTime;
	}
	public String toString() {
		return "User [name=" + name + ", passWorld=" + passWorld
				+ ", isOnline=" + isOnline + ", onlineTime=" + onlineTime + "]";
	}
}
class TestUseru{
	public static void main(String[] args) {
		List<Useru> list = new ArrayList<>();
		list.add(new Useru("mgx","12344",true,120));
		list.add(new Useru("hxz","22334",false,7));
		list.add(new Useru("xiaoya","22455",false,70));
		list.add(new Useru("haha","54334",true,10));
		list.add(new Useru("rr","11245",true,108));
		list.add(new Useru("yaya","34532",true,8));
		for(Useru u : list){
			System.out.println(u.toString());
		}
		int count = 0;
		for(Useru u :list){
			if(u.isOnline() == true){
				count ++;
			}
		}
		System.out.println("在线人数为："+count);
		for(Useru u :list){
			System.out.println(u.getName()+"在线总时长为"+u.getOnlineTime()+"小时");
		}
		for(Useru u : list){
			if(u.getOnlineTime()>100){
				u.setOnlineTime(0);
			}
		}
	}
}
//第三题
class Student{
	private String name;
	private int age;
	private Double score;
	public Student() {
		super();
	}
	public Student(String name, int age, Double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}
}
class TestStudent{
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("mgx",18,95.0));
		list.add(new Student("mgg",22,0.0));
		list.add(new Student("yaya",21,89.0));
		list.add(new Student("hehe",20,0.0));
		list.add(new Student("xixi",23,12.0));
		list.add(new Student("jiji",20,0.0));
		list.add(new Student("haha",21,0.0));
		list.remove(3);
		for(int i = 0;i<list.size();i++){
			if(list.get(i).getScore() == 0.0){
				list.set(i, new Student("胡鑫哲",58,10.0));
			}
		}
		System.out.println(list.get(5).getName());
		for(Student s : list){
			System.out.println(s);
		}
		list.add(2, new Student("xiaoya",18,99.0));
	}
}
//第四题
class Teacher{
	private String name;
	private int age;
	private String subject;
	public Teacher() {
		super();
	}
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", subject="
				+ subject + "]";
	}
}
class TestTeacher{
	public static void main(String[] args) {
		List<Teacher> list = new ArrayList<Teacher>();
		list.add(new Teacher("wx",18,"java"));
		list.add(new Teacher("zs",18,"java"));
		list.add(new Teacher("ly",20,"other"));
		list.add(new Teacher("hx",53,"java"));
		list.add(new Teacher("yd",30,"other"));
		list.add(new Teacher("ss",40,"java"));
		list.add(new Teacher("xc",42,"other"));
		list.remove(3);
		System.out.println(list.get(5).getAge());
		for(Teacher t : list){
			if(t.getSubject().equals("java")){
				System.out.println(t);
			}
		}
		for(Teacher t : list){
			System.out.println(t);
		}
	}
}
//第五题
class Employee{
	private String name;
	private int age;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}
}
class TestEmployee{
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("胡1",23,3000.0));
		list.add(new Employee("马1",24,4500.0));
		list.add(new Employee("胡2",25,5000.0));
		list.add(new Employee("马胡",26,2800.0));
		list.add(new Employee("张3",27,4700.0));
		list.add(new Employee("张胡胡",40,10000.0));
		for(Employee e : list){
			System.out.println(e);
		}
		double average = 0.0;
		for(Employee e : list){
			average+=e.getSalary();
		}
		System.out.println(average/list.size());
		for(Employee e : list){
			if(e.getName().contains("胡")){
				System.out.println(e);
			}
		}
		for(Employee e : list){
			if(e.getName().charAt(0) == '胡'){
				System.out.println(e);
			}
		}
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for(int i = 0; i<list.size();i++){
			if(list.get(i).getName().equals(s)){
				System.out.println(list.get(i));
				count+=1;
			}
		}
		if(count == 0) System.out.println("查无此人");
		double d = sc.nextDouble();
		for(Employee e : list){
			if(e.getSalary() > d){
				System.out.println(e);
			}
		}
	}
}
//第六题
class Productor{
	private String name;
	private double price;
	private int number;
	private String address;
	public Productor() {
		super();
	}
	public Productor(String name, double price, int number, String address) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Productor [name=" + name + ", price=" + price + ", number="
				+ number + ", address=" + address + "]";
	}
}
class TestProductor{
	public static void main(String[] args) {
		List<Productor> list = new ArrayList<Productor>();
		list.add(new Productor("a",3000,3000,"天津"));
		list.add(new Productor("b",1800,0,"上海"));
		list.add(new Productor("c",1000,5000,"北京"));
		list.add(new Productor("d",1200,2800,"杭州"));
		list.add(new Productor("e",500,4700,"北京"));
		list.add(new Productor("f",5000,0,"河南"));
		for(Productor p : list){
			System.out.println(p);
		}
		for(Productor p : list){
			if(p.getPrice() > 1000.0){
				System.out.println(p);
			}
		}
		for(Productor p : list){
			if(p.getNumber() == 0){
				System.out.println(p);
			}
		}
		for(Productor p : list){
			if(p.getAddress().equals("北京")){
				System.out.println(p);
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品名字：");
		String str = sc.next();
		int count = 0;
		for(Productor p : list){
			if(p.getName().equals(str)){
				count+=1;
				System.out.println(p);
			}
		}
		if (count == 0) System.out.println("商场无此商品");
		System.out.println("请输入一个价格区间：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(Productor p : list){
			if(p.getPrice()>a && p.getPrice()<b){
				System.out.println(p);
			}
		}
	}
}
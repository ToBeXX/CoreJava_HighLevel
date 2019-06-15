package day17;
import java.util.*;
/*
 * 第1题
 * Collection 接口的特点是元素是 无序
 * List接口的特点是元素有序  可以重复
 * Set接口的特点是元素无序 不可以重复
 */
/*
 * 第2题
 * Collection中定义的添加方法声明是  boolean add(E e) 
 * 删除方法的声明  boolean remove（Object o）
 * 获取元素的方法声明  int size（）
 * List中定于的与下标相关的添加方法的声明是  void add（int index，E e）
 * 与下标相关的删除方法的声明是 void remove（int index）
 * 获取元素的方法声明  E get(int index)
 * 
 */
//第三题
class TstList{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add(1,"Learn");
		list.add(1,"Java");
		printList(list);
	}
	public static void printList(List<String> list){
		for(int i = 0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static void printCollection(Collection<String> collection){
		for(String str : collection){
			System.out.println(str);
		}
	}
}
//第四题
class TestList1{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Hello");
		list.add("Learn");
		list.remove("Hello");
		list.remove(0);
		for(int i = 0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
/*
 * Hello
 * Learn
 */
//第五题
class Worker{
	private int age;
	private String name;
	private double salary;
	public Worker() {
		super();
	}
	public Worker(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void work(){
		System.out.println(name+"work");
	}
	public String toString() {
		return "Worker [age=" + age + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}
}
class TestWork{
	public static void main(String[] args) {
		List<Worker> list = new ArrayList<Worker>();
		list.add(new Worker(18,"zhang3",3000.0));
		list.add(new Worker(25,"li4",3500.0));
		list.add(new Worker(22,"wang5",3200.0));
		list.add(1,new Worker(24,"zhao6",3300.0));
		for(int i = 0;i<list.size();i++){
			System.out.println(list.get(i).toString());
		}
		for(Worker w : list){
			w.work();
		}
	}
}
//第六题
class Animal{}
class Dog extends Animal{
	public void play(){
		System.out.println("Dog play with you");
	}
}
class Cat extends Animal{
	public static void main(String[] args) {
		List<Animal> as = new ArrayList<>();
		as.add(new Dog());
		as.add(new Cat());
		as.add(new Dog());
		as.add(new Cat());
		List<Dog> dogs = getAllDog(as);
		for(Dog d : dogs){
			System.out.println(d);
		}
	}
	public static List<Dog> getAllDog(List<Animal> animals){
		List<Dog> d = new ArrayList<Dog>();
		for(Animal a : animals){
			if(a.getClass() == Dog.class){
				Dog d1 = (Dog)a;
				d.add(d1);
			}
		}
		return d;
	}
}
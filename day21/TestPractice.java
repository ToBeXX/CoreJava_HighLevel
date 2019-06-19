package day21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*Collection �ӿڵ��ص���Ԫ��Object
List �ӿڵ��ص���Ԫ����˳�� �����ظ�
Set�ӿڵ��ص���Ԫ����˳�� �������ظ�
Map�ӿڵ��ص���Ԫ���Ǽ�ֵ�� ���м��������ظ� ֵ�����ظ�*/
//��2��

/*Map�ж������ӷ��������� put��Object key��Object value��
ɾ����������remove��Object key��
��ȡԪ�ظ����ķ������� size����
�жϰ���ָ��key �ķ������� contaisKey��Object key��
�жϰ���ָ��value �ķ������� contaisValue��Object value��
Set<> = map.keySet����
Collection<> values = map.values����
Set<Map.Entry<Object key,Object value>> eset = map.entrySet()*/

//��3��
class Worker{
	private int age;
	private String name;
	private double salary;
	public Worker(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public Worker() {
		super();
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
	
	@Override
	public String toString() {
		return "Worker [age=" + age + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	@Override
	public int hashCode() {
		if(name != null) return name.hashCode()+age;
		else return age+(int)salary;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Worker w = (Worker)o;
		if(this.getAge()==w.age && this.getSalary() == w.salary && this.getName().equals(w.name)){
			return true;
		}else return false;
	}
}
class TestWorker{
	public static void main(String[] args) {
		Set<Worker> set = new HashSet<>();
		set.add(new Worker(18,"zhang3",3000.0));
		set.add(new Worker(25,"li4",3500.0));
		set.add(new Worker(22,"wang5",3200.0));
		Iterator<Worker> it = set.iterator();
		while(it.hasNext()){
			Worker w = it.next();
			if(w.getName().equals("wang5")){
				set.remove(w);
			}
			w.work();
		}
		for(Worker w : set){
			System.out.println(w);
		}
	}
}
class TestMap{
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("dield1","field2");
		map.put("tom","corejava");
		map.put("john","oracle");
		map.put("susan","oracle");
		map.put("jerry","jdbc");
		map.put("jim","unix");
		map.put("kevin","jsp");
		map.put("lucy","jsp");
		map.put("allen", "corejava");
		map.put("lucy", "corejava");
		Set<String> set = map.keySet();
		for(String s : set){
			String value = map.get(s);
			System.out.println(s+"----"+value);
		}
		System.out.println("===============================");
		Set<Map.Entry<String, String>> eset = map.entrySet();
		for(Map.Entry<String, String> e :eset){
			if(e.getValue().equals("corejava")){
				String value = e.getValue();
				System.out.println(e.getKey()+"-----"+value);
			}
		}
	}
}
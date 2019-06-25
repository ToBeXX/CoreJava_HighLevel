package day_6_22;
/*自定义序列化，需要实现Externalizable接口  该接口是Seriaizable子接口
覆盖writeExternal(ObjectOutput out)   readExternal(ObjectInput in)两个方法*/
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("fileObject/object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student s = new Student("mgx",18);
		oos.writeObject(s);
		oos.close();
		FileInputStream  fis = new FileInputStream("fileObject/object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student)ois.readObject();
		ois.close();
		System.out.println(student.toString());
	}
}
class Student implements Externalizable{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student() {
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
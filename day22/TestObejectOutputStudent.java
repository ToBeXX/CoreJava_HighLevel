package day22;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestObejectOutputStudent {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("file/f.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<Student> list = new ArrayList();
		list.add(new Student("haha",18,3000.0,true));
		list.add(new Student("hehe",19,3040.0,false));
		list.add(new Student("xixi",20,3050.0,true));
		list.add(new Student("xuxu",21,3060.0,false));
		list.add(new Student("jiji",22,3070.0,true));
		for(Student s :list){
			oos.writeObject(s);
		}
		oos.close();
		FileInputStream fis = new FileInputStream("file/f.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		for(int i = 0;i<5;i++){
			Student s = (Student)ois.readObject();
			System.out.println(s.toString());
		}
	}
}

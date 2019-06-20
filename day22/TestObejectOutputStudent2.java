package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestObejectOutputStudent2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("file/h.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<Student3> list = new ArrayList();
		list.add(new Student3("haha",18,3000.0,true,new Address3("henan","453400")));
		list.add(new Student3("hehe",19,3040.0,false,new Address3("beijing","453500")));
		list.add(new Student3("xixi",20,3050.0,true,new Address3("shanghai","100023")));
		list.add(new Student3("xuxu",21,3060.0,false,new Address3("jinan","234567")));
		list.add(new Student3("jiji",22,3070.0,true,new Address3("shanxi","345567")));
		for(Student3 s :list){
			oos.writeObject(s);
		}
		oos.close();
		FileInputStream fis = new FileInputStream("file/h.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		for(int i = 0;i<5;i++){
			Object s = ois.readObject();
			System.out.println(s.toString());
		}
	}
}

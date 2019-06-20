package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestObejectOutputStudent1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("file/g.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<Student2> list = new ArrayList();
		list.add(new Student2("haha",18,3000.0,true,new Address2("henan","453400")));
		list.add(new Student2("hehe",19,3040.0,false,new Address2("beijing","453500")));
		list.add(new Student2("xixi",20,3050.0,true,new Address2("shanghai","100023")));
		list.add(new Student2("xuxu",21,3060.0,false,new Address2("jinan","234567")));
		list.add(new Student2("jiji",22,3070.0,true,new Address2("shanxi","345567")));
		for(Student2 s :list){
			oos.writeObject(s);
		}
		oos.close();
		FileInputStream fis = new FileInputStream("file/g.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		for(int i = 0;i<5;i++){
			Student2 s = (Student2)ois.readObject();
			System.out.println(s.toString());
		}
	}
}

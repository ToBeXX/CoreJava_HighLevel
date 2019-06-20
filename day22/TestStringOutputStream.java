package day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestStringOutputStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("file/i.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		List<String> list = new ArrayList<>();
		list.add("张三-18-1000.0");
		list.add("李四-18-1000.0");
		list.add("王五-18-1000.0");
		list.add("赵六-18-1000.0");
		list.add("孙七-18-1000.0");
		for(String s : list){
			oos.writeObject(s);
		}
		oos.close();
		FileInputStream fis = new FileInputStream("file/i.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		for(int i = 0;i<list.size();i++){
			String s = (String)ois.readObject();
			System.out.println(s);
		}
		ois.close();
		System.out.println("=======================");
		FileInputStream fis1 = new FileInputStream("file/i.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		FileOutputStream fos1 = new FileOutputStream("file/j.txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		for(int i =0;i<list.size();i++){
			String s = (String)ois1.readObject();
			oos1.writeObject(s);
		}
		ois1.close();
		oos1.close();
		FileInputStream fis2 = new FileInputStream("file/j.txt");
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		for(int i =0;i<list.size();i++){
			Object s = ois2.readObject();
			System.out.println(s);
		}
		ois2.close();
	}
}

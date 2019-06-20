package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("file/b.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println(ois.readLine());
		
//		Object o = ois.readObject();
//		System.out.println(o);
		
		/*Object o1 = ois.readObject();
		System.out.println(o1);*/
		
		ois.close();
	}
}
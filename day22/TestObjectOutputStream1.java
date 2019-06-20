package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.omg.PortableInterceptor.ObjectIdHelper;

public class TestObjectOutputStream1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("file/e.txt");
		ObjectOutput oop = new ObjectOutputStream(fos);
		oop.writeDouble(3.5);
		oop.writeUTF("ÄãºÃ");
		oop.close();
		FileInputStream fis = new FileInputStream("file/e.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(ois.readDouble());
		System.out.println(ois.readUTF());
		ois.close();
	}
}

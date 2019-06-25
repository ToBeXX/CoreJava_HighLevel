package day23;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestFileInOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		try {
			File f = new File("test.txt");
			if(f.exists()) {
				fos = new FileOutputStream("test.txt",true);
				oos = new ObjectOutputStream(fos);
				oos.writeUTF("Hello World"); 
				
			}
			else{
				fos = new FileOutputStream("test.txt");
				oos = new ObjectOutputStream(fos);
				oos.writeUTF("Hello World");
				
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileInputStream fis;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("test.txt");
			ois = new ObjectInputStream(fis);
			while(true){
				try{
					String s = ois.readUTF();
					System.out.println(s);
				}catch(EOFException e){
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

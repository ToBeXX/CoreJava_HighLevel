package day23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestData {
	public static void main(String[] args) throws IOException {
		File f = new File("test.dat");
		if(!f.exists()){
			FileOutputStream fos = new FileOutputStream("test.dat",true);
			DataOutputStream oos = new DataOutputStream(fos);
			oos.writeLong(10000L);
			oos.close();
		}
		else{
			FileInputStream fis = new FileInputStream("test.dat");
			DataInputStream ois = new DataInputStream(fis);
			long l = ois.readLong();
			long l1 = l+1;
			ois.close();
			FileOutputStream fos1 = new FileOutputStream("test.dat",true);
			DataOutputStream oos1 = new DataOutputStream(fos1);
			oos1.writeLong(l1);
		}
	}
}

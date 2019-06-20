package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCharOutput {
	public static void main(String[] args) throws IOException {
//		第1题
		FileOutputStream fos = new FileOutputStream("file/a.txt");
		byte[] c = new byte[26];
		int i = 0;
		for(byte a = 97;a<(97+26);a++){
			c[i++] = a;
		}
		fos.write(c);
		fos.close();
//		第2题
		FileInputStream fis = new FileInputStream("file/a.txt");
		FileOutputStream fos1 = new FileOutputStream("file/b.txt");
		while(true){
			int  a = fis.read();
			if(a == -1) break;
			System.out.println((char)a);
			fos1.write(a);
		}
		fis.close();
		fos1.close();
	}
}

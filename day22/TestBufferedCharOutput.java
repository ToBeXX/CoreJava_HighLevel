package day22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedCharOutput {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("file/c.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] b = new byte[26];
		int j = 0;
		for(byte i = 65;i<(65+26);i++){
			b[j++] = i;
		}
		bos.write(b);
		bos.close();
		FileInputStream fis = new FileInputStream("file/c.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos1 = new FileOutputStream("file/d.txt");
		BufferedOutputStream bos1 = new BufferedOutputStream(fos1) ;
		while(true){
			int a = bis.read();
			if(a == -1) break;
			System.out.println((char)a);
			bos1.write(a);
		}
		bis.close();
		bos1.close();
	}
}

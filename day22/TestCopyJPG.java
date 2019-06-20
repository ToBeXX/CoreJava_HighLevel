package day22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyJPG {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Java\\CoreJava\\day22 ----IO流\\练习\\gril.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("file/副本.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while(true){
			int  a = bis.read();
			if(a == -1) break;
			bos.write(a);
		}
		bis.close();
		bos.close();
		FileInputStream fis1 = new FileInputStream("D:\\Java\\CoreJava\\day22 ----IO流\\练习\\Corporate.mp3");
		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		FileOutputStream fos1 = new FileOutputStream("file/副本.mp3");
		BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
		long start = System.currentTimeMillis();
		while(true){
			int  a = bis1.read();
			if(a == -1) break;
			bos1.write(a);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		bis1.close();
		bos1.close();
	}
}

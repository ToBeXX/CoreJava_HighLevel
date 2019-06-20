package day22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferOutputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Java\\简介.wmv");
		FileOutputStream fos = new FileOutputStream("D:\\Java\\测试IO编程\\实现文件拷贝.wmv");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		long start = System.currentTimeMillis();
		while(true){
			int a = bis.read();
			if(a == -1) break;
			bos.write(a);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		bis.close();
		bos.close();
	}
}

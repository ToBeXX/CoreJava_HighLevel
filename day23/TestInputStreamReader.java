package day23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestInputStreamReader {
	public static void main(String[] args) throws IOException {
//		读入文件
		FileInputStream is = new FileInputStream("file1/aa.txt");
//		建立读入桥转换
		Reader r = new InputStreamReader(is,"GBk");
//		包装流
		BufferedReader br = new BufferedReader(r);
//		读入
		while(true){
			String s = br.readLine();
			if(s == null) break;
			System.out.println(s);
		}
//		关流
		br.close();
	}
}

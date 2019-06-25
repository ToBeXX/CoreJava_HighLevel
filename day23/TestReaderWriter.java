package day23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class TestReaderWriter {
	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("file1/a.txt");
		w.write("我");
		w.write("爱");
		w.write("你");
		w.write("中");
		w.write("国");
		w.close();
		Reader r = new FileReader("file1/a.txt");
		char[] c = new char[6];
		int a = r.read(c);
		System.out.println("读取的有效个数"+a);
		for(char b : c){
			System.out.println(b);
		}
		r.close(); 
		String s = "我爱你中国";
		byte[] bs = s.getBytes("GBK");
		String s1 = new String(bs,"GBK");
		System.out.println(s1);
	}
}

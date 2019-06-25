package day23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestInputStreamReader {
	public static void main(String[] args) throws IOException {
//		�����ļ�
		FileInputStream is = new FileInputStream("file1/aa.txt");
//		����������ת��
		Reader r = new InputStreamReader(is,"GBk");
//		��װ��
		BufferedReader br = new BufferedReader(r);
//		����
		while(true){
			String s = br.readLine();
			if(s == null) break;
			System.out.println(s);
		}
//		����
		br.close();
	}
}

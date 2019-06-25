package day23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TestInOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("file2/test.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
		PrintWriter out = new PrintWriter(osw);
		out.println("窗前明月光");
		out.println("疑是地上霜");
		out.println("举头望明月");
		out.println("低头思故乡");
		out.close();
		FileInputStream fis = new FileInputStream("file2/test.txt");
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		BufferedReader br = new BufferedReader(isr);
		List<String> list = new ArrayList<>();
		while(true){
			String s  = br.readLine();
			if(s == null) break;
			System.out.println(s);
			list.add(s);
		}
		br.close();
		String[] str =new String[list.size()];
		int i = 0;
		for(String s :list){
			str[i] = s;
			i++;
		}
		FileOutputStream fos1 = new FileOutputStream("file2/test1.txt");
		OutputStreamWriter osw1 = new OutputStreamWriter(fos1,"UTF-8");
		PrintWriter out1 = new PrintWriter(osw1);
		for(int k = str.length-1;k>=0;k--){
			System.out.println(str[k]);
			out1.println(str[k]);
		}
		out1.close();
	}
}

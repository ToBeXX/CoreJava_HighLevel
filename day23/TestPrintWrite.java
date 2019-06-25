package day23;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
public class TestPrintWrite {
	public static void main(String[] args) throws IOException {
		 FileOutputStream fis = new FileOutputStream("file1/b.txt");
		 Writer w = new OutputStreamWriter(fis,"UTF-8");
		 PrintWriter pw = new PrintWriter(w);
//		 PrintWriter pw = new PrintWriter("file1/b.txt");   可不写上边三行  直接写这句
		 /*BufferedWriter bw = new BufferedWriter(w);
		 bw.write("白日依山尽");
		 bw.write("黄河如海流");
		 bw.write("欲穷千里目");
		 bw.write("更上一层楼");
		 bw.close();*/
		 pw.println("白日依山尽haha!");
		 pw.println("黄河如海流xixi@");
		 pw.println("欲穷千里目jiji#");
		 pw.println("更上一层楼hehe$");
		 pw.close();
		 InputStream is = new FileInputStream("file1/aa.txt");
		 Reader r = new InputStreamReader(is,"GBK");
		 BufferedReader br = new BufferedReader(r);
		 /*String s = br.readLine();
		 System.out.println(s);*/
		 while(true){
			String s = br.readLine();
			if(s == null) break;
			System.out.println(s);
		 }
		 br.close();
		/* while(true){
			 int a = is.read();
			 if(a == -1) break;
			 System.out.print((char)a);
		 }*/
	}
}

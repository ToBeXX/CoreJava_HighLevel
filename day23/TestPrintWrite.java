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
//		 PrintWriter pw = new PrintWriter("file1/b.txt");   �ɲ�д�ϱ�����  ֱ��д���
		 /*BufferedWriter bw = new BufferedWriter(w);
		 bw.write("������ɽ��");
		 bw.write("�ƺ��纣��");
		 bw.write("����ǧ��Ŀ");
		 bw.write("����һ��¥");
		 bw.close();*/
		 pw.println("������ɽ��haha!");
		 pw.println("�ƺ��纣��xixi@");
		 pw.println("����ǧ��Ŀjiji#");
		 pw.println("����һ��¥hehe$");
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

package day23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("worldcup.txt");
		if(file.exists()){
			String s = file.getAbsolutePath();
			int a = s.lastIndexOf('\\');
			String str = s.substring(0, a+1);
			String str1 = s.substring(a+1, s.length());
			String str2 = str+"copy_"+str1;
			File f1 = new File(str2);
			f1.createNewFile();
			FileInputStream fis = new FileInputStream(s);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			FileOutputStream fos = new FileOutputStream(str2);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			PrintWriter pw = new PrintWriter(osw);
			while(true){
				String s1 = br.readLine();
				if(s1 == null) break;
				pw.println(s1);
			}
			br.close();
			pw.close();
		}
	}
}

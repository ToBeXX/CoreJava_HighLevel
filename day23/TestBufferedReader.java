package day23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestBufferedReader {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("worldcup.txt");
		OutputStreamWriter ops = new OutputStreamWriter(fos,"UTF-8");
		PrintWriter bw = new PrintWriter(ops);
		bw.println("2006/意大利");
		bw.println("2002/巴西");
		bw.println("1998/阿根廷");
		bw.println("1994/中国");
		bw.println("1990/法国");
		bw.println("1986/巴西");
		bw.println("1982/中国");
		bw.println("1978/美国");
		bw.println("1974/日本");
		bw.close();
		FileInputStream fis = new FileInputStream("worldcup.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		Map<String, String> map = new HashMap<>();
		while(true){
			String s = br.readLine();
			if(s == null) break;
			String[] str = s.split("/");
			map.put(str[0], str[1]);
		}
		br.close();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查询的世界杯冠军的年份：");
		String s = sc.next();
		int i =0;
		Set<Map.Entry<String, String>> set = map.entrySet();
		for(Map.Entry<String, String> eset :set){
			if(eset.getKey().equals(s)){
				System.out.println(map.get(eset.getKey()));
				i++;
			}
		}
		if(i == 0) System.out.println("该年份没有举办世界杯");
	}
}

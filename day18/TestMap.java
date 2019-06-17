package day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//µÚ14Ìâ
public class TestMap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			if(!map.containsKey(c)){
				map.put(c, 1);
			}
			else{
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println(map);
	}
}
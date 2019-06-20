package day17;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("wawa");
		list.add("zhuazhua");
		list.add("piapia");
		list.add("xixi");
		list.add("haha");                          
		// Ôö
		list.add(2, "xuxu");
		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
		// É¾
		list.remove(0);
		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
		// ¸Ä
		list.set(list.size() - 1, "yaya");
		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
		// ²é
		list.get(0);
	}
}

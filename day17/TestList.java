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
		// ��
		list.add(2, "xuxu");
		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
		// ɾ
		list.remove(0);
		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
		// ��
		list.set(list.size() - 1, "yaya");
		for (String str : list) {
			System.out.print(str + "\t");
		}
		System.out.println();
		// ��
		list.get(0);
	}
}

package day18;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//��ʮ����
class TestCountChar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.next();
		Map<Character,Integer> map = new HashMap<>();
		char[] ch = s.toCharArray();
		for(Character c : ch){
			if(!map.containsKey(c)){
				map.put(c, 1);
			}
			else map.put(c, map.get(c)+1);
		}
		System.out.println(map);
//		1.��ֵ����
		Set<Character> keys = map.keySet();
		for(Character key : keys){
			Integer value = map.get(key);
			System.out.println(key+"----"+value);
		}
//		Map.Entry����
		Set<Map.Entry<Character, Integer>> entry = map.entrySet();
		for(Map.Entry<Character, Integer> entrys : entry){
			char c = entrys.getKey();
			int n = entrys.getValue();
			System.out.println(c+"---"+n);
		}
//		value����
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println(value);
		}
//		1.8֮��ı���
		/*map.forEach(new BiConsumer<Character,Integer>(){
			public void accept(Character key,Integer value){
				System.out.println(key+"---"+value);
			}
		});*/
	}
}

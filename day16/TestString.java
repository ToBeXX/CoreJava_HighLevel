package day16;
class TestString{
	public static void main(String[] args) {
		String s = "hsjkdalfhsdjk";
//		返回指定下标处对应的字符
		System.out.println(s.charAt(2));
//		将字符串转换成数组
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i]);
		}
		System.out.println();
//		返回指定字符串在s中出现的下标（第一次出现的下标,若s中不包含此字符串  则返回-1
		System.out.println(s.indexOf("sk"));
//		返回指定字符串在s中出现的下标（最后一次出现的下标,若s中不包含此字符串  则返回-1
		System.out.println(s.lastIndexOf("jd"));
//		indexOf(String s,int index):返回值指定字符串第一次出现的下标 ，从指定下标开始寻找
		System.out.println(s.indexOf("jk",5));
//		获取字符串的长度
		System.out.println(s.length());
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.print(c);
		}
		System.out.println();
		String s1 = " abc ";
		System.out.println(s1);
//		去除字符串的前后空格 返回值类型 为String。中间的不包括		
		System.out.println(s1.trim());		
		String s2 = "123 ";
//		去除空格后传参
		int a = Integer.parseInt(s2.trim());	
		String s3 = "2019-6-11";
		String[] ss = s3.split("-");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		//年
		System.out.println("年份为"+ss[0]);
		//月
		System.out.println("月份为"+ss[1]);
		//日
		System.out.println("日份为"+ss[2]);
		String s4 = "HSsajdkfJDshdjfHF";		
//		将字符串转换大写
		System.out.println(s4.toUpperCase());
//		将字符串转换成小写
		System.out.println(s4.toLowerCase());
		String userString = "ASdk";	//用户输入的字符串
		String imageCode = "AsDk";	//程序员拥有的字符串
//		将两个字符串全部转换成大写
		String str1 = userString.toUpperCase();
		String str2 = imageCode.toUpperCase();
		System.out.println(str1.equals(str2));
//		判断字符串 是否以sdk字符串结尾
		System.out.println(s4.endsWith("sdk"));
		String s5 = "HelloWorld.java";
		System.out.println(s5.endsWith(".java"));
		System.out.println(s5.endsWith(".txt"));
//		判断s4中是否包含 参数sadf字符串
		System.out.println(s4.contains("sadf"));
	}
}
class TestString1{
	public static void main(String[] args) {
		String s = "abcdefgabcdhigjktlmabcn";
//		char charAt(int index)   返回index处的字符
		System.out.println(s.charAt(4));
//		char[] toCharArray()  转换成字符数组  用此方法进行遍历
		char[] a = s.toCharArray();
		for(char b : a){
			System.out.println(b);
		}
//		返回该字符串在s中第一次出现的下标  int indexOf(String s) 没有返回-1
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf(97));
//		返回该字符串在s中最后一次出现的下标int  lastIndexOf(String s)  没有返回-1
		System.out.println(s.lastIndexOf("abc"));
//		从指定位置开始寻找该字符第一次出现的位置 int lastIndexOf(String s,int a) 没有返回-1
		System.out.println(s.indexOf("abc", 3));
//		获取字符串的长度 int length()  可以用此方法配合  charAt()  toCharArrar()方法进行遍历
		System.out.println(s.length());
//		遍历1
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.println(c);
		}
//		遍历2
		char[] ch = s.toCharArray();
		for(int i = 0;i<s.length();i++){
			System.out.println(ch[i]);
		}
//		去除字符串前后空格 void trim(String s)  中间空格无法去除
		String s1 = "  123  ";
		System.out.println(s1);
		System.out.println(s1.trim());
//		将空格去除后 将String转换成int型
		int i = Integer.parseInt(s1.trim());
		System.out.println(i);
//		根据给定的字符串拆分字符串  String[] split(String s) 拆分成一个String类型数组
		String s2 = "2019-6-11";
		String[] str = s2.split("-");
		for(String s3: str){
			System.out.println(s3);
		}
//		将字符串全部转化成大写
		String s4 = "AdsHjk";
		System.out.println(s4);
		System.out.println(s4.toUpperCase());
//		将字符串全部转化成小写	
		System.out.println(s4.toLowerCase());
//		转换大小写的应用  验证码：大小写不限
//		验证码  
		String  s5 = "AkHGi";
//		用户输入
		String s6 = "aKhgI";
//		进行判断(转换成大小写都行)
		System.out.println(s5.toLowerCase().equals(s6.toLowerCase()));
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase()));
//		判断是否以给定字符串结尾  boolean endsWith(String s)
		String s7 = "1234@163.com";
		System.out.println(s7.endsWith(".com"));
//		判断是否以给定字符串开头  boolean startsWith(String s)
		System.out.println(s7.startsWith("1234"));
//		判断字符串中是否存在给定字符串   boolean contains(String s)
		System.out.println(s7.contains("@"));
	}
}
class TestString2{
	public static void main(String[] args) {
		String s = "kolingkoangpap";
//		char charAt(int index)   返回index处的字符
		System.out.println(s.charAt(4));
//		char[] toCharArray()  转换成字符数组  用此方法进行遍历
		char[] a = s.toCharArray();
		for(char b : a){
			System.out.println(b);
		}
//		返回该字符串在s中第一次出现的下标  int indexOf(String s) 没有返回-1
		System.out.println(s.indexOf("ko"));
		System.out.println(s.indexOf(97));
//		返回该字符串在s中最后一次出现的下标int  lastIndexOf(String s)  没有返回-1
		System.out.println(s.lastIndexOf("ko"));
//		从指定位置开始寻找该字符第一次出现的位置 int lastIndexOf(String s,int a) 没有返回-1
		System.out.println(s.indexOf("ko", 3));
//		获取字符串的长度 int length()  可以用此方法配合  charAt()  toCharArrar()方法进行遍历
		System.out.println(s.length());
//		遍历1
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.println(c);
		}
//		遍历2
		char[] ch = s.toCharArray();
		for(int i = 0;i<s.length();i++){
			System.out.println(ch[i]);
		}
//		去除字符串前后空格 void trim(String s)  中间空格无法去除
		String s1 = "  123  ";
		System.out.println(s1);
		System.out.println(s1.trim());
//		将空格去除后 将String转换成int型
		int i = Integer.parseInt(s1.trim());
		System.out.println(i);
//		根据给定的字符串拆分字符串  String[] split(String s) 拆分成一个String类型数组
		String s2 = "2017-12-13";
		String[] str = s2.split("-");
		for(String s3: str){
			System.out.println(s3);
		}
//		将字符串全部转化成大写
		String s4 = "AbCdEfG";
		System.out.println(s4);
		System.out.println(s4.toUpperCase());
//		将字符串全部转化成小写	
		System.out.println(s4.toLowerCase());
//		转换大小写的应用  验证码：大小写不限
//		验证码  
		String  s5 = "AcSdNpO";
//		用户输入
		String s6 = "acsdnpo";
//		进行判断(转换成大小写都行)
		System.out.println(s5.toLowerCase().equals(s6.toLowerCase()));
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase()));
//		判断是否以给定字符串结尾  boolean endsWith(String s)
		String s7 = "www.baidu.com.cn";
		System.out.println(s7.endsWith(".cn"));
//		判断是否以给定字符串开头  boolean startsWith(String s)
		System.out.println(s7.startsWith("www."));
//		判断字符串中是否存在给定字符串   boolean contains(String s)
		System.out.println(s7.contains(".com"));
	}
}
package day16;
class TestString{
	public static void main(String[] args) {
		String s = "hsjkdalfhsdjk";
//		����ָ���±괦��Ӧ���ַ�
		System.out.println(s.charAt(2));
//		���ַ���ת��������
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i]);
		}
		System.out.println();
//		����ָ���ַ�����s�г��ֵ��±꣨��һ�γ��ֵ��±�,��s�в��������ַ���  �򷵻�-1
		System.out.println(s.indexOf("sk"));
//		����ָ���ַ�����s�г��ֵ��±꣨���һ�γ��ֵ��±�,��s�в��������ַ���  �򷵻�-1
		System.out.println(s.lastIndexOf("jd"));
//		indexOf(String s,int index):����ֵָ���ַ�����һ�γ��ֵ��±� ����ָ���±꿪ʼѰ��
		System.out.println(s.indexOf("jk",5));
//		��ȡ�ַ����ĳ���
		System.out.println(s.length());
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.print(c);
		}
		System.out.println();
		String s1 = " abc ";
		System.out.println(s1);
//		ȥ���ַ�����ǰ��ո� ����ֵ���� ΪString���м�Ĳ�����		
		System.out.println(s1.trim());		
		String s2 = "123 ";
//		ȥ���ո�󴫲�
		int a = Integer.parseInt(s2.trim());	
		String s3 = "2019-6-11";
		String[] ss = s3.split("-");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		//��
		System.out.println("���Ϊ"+ss[0]);
		//��
		System.out.println("�·�Ϊ"+ss[1]);
		//��
		System.out.println("�շ�Ϊ"+ss[2]);
		String s4 = "HSsajdkfJDshdjfHF";		
//		���ַ���ת����д
		System.out.println(s4.toUpperCase());
//		���ַ���ת����Сд
		System.out.println(s4.toLowerCase());
		String userString = "ASdk";	//�û�������ַ���
		String imageCode = "AsDk";	//����Աӵ�е��ַ���
//		�������ַ���ȫ��ת���ɴ�д
		String str1 = userString.toUpperCase();
		String str2 = imageCode.toUpperCase();
		System.out.println(str1.equals(str2));
//		�ж��ַ��� �Ƿ���sdk�ַ�����β
		System.out.println(s4.endsWith("sdk"));
		String s5 = "HelloWorld.java";
		System.out.println(s5.endsWith(".java"));
		System.out.println(s5.endsWith(".txt"));
//		�ж�s4���Ƿ���� ����sadf�ַ���
		System.out.println(s4.contains("sadf"));
	}
}
class TestString1{
	public static void main(String[] args) {
		String s = "abcdefgabcdhigjktlmabcn";
//		char charAt(int index)   ����index�����ַ�
		System.out.println(s.charAt(4));
//		char[] toCharArray()  ת�����ַ�����  �ô˷������б���
		char[] a = s.toCharArray();
		for(char b : a){
			System.out.println(b);
		}
//		���ظ��ַ�����s�е�һ�γ��ֵ��±�  int indexOf(String s) û�з���-1
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf(97));
//		���ظ��ַ�����s�����һ�γ��ֵ��±�int  lastIndexOf(String s)  û�з���-1
		System.out.println(s.lastIndexOf("abc"));
//		��ָ��λ�ÿ�ʼѰ�Ҹ��ַ���һ�γ��ֵ�λ�� int lastIndexOf(String s,int a) û�з���-1
		System.out.println(s.indexOf("abc", 3));
//		��ȡ�ַ����ĳ��� int length()  �����ô˷������  charAt()  toCharArrar()�������б���
		System.out.println(s.length());
//		����1
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.println(c);
		}
//		����2
		char[] ch = s.toCharArray();
		for(int i = 0;i<s.length();i++){
			System.out.println(ch[i]);
		}
//		ȥ���ַ���ǰ��ո� void trim(String s)  �м�ո��޷�ȥ��
		String s1 = "  123  ";
		System.out.println(s1);
		System.out.println(s1.trim());
//		���ո�ȥ���� ��Stringת����int��
		int i = Integer.parseInt(s1.trim());
		System.out.println(i);
//		���ݸ������ַ�������ַ���  String[] split(String s) ��ֳ�һ��String��������
		String s2 = "2019-6-11";
		String[] str = s2.split("-");
		for(String s3: str){
			System.out.println(s3);
		}
//		���ַ���ȫ��ת���ɴ�д
		String s4 = "AdsHjk";
		System.out.println(s4);
		System.out.println(s4.toUpperCase());
//		���ַ���ȫ��ת����Сд	
		System.out.println(s4.toLowerCase());
//		ת����Сд��Ӧ��  ��֤�룺��Сд����
//		��֤��  
		String  s5 = "AkHGi";
//		�û�����
		String s6 = "aKhgI";
//		�����ж�(ת���ɴ�Сд����)
		System.out.println(s5.toLowerCase().equals(s6.toLowerCase()));
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase()));
//		�ж��Ƿ��Ը����ַ�����β  boolean endsWith(String s)
		String s7 = "1234@163.com";
		System.out.println(s7.endsWith(".com"));
//		�ж��Ƿ��Ը����ַ�����ͷ  boolean startsWith(String s)
		System.out.println(s7.startsWith("1234"));
//		�ж��ַ������Ƿ���ڸ����ַ���   boolean contains(String s)
		System.out.println(s7.contains("@"));
	}
}
class TestString2{
	public static void main(String[] args) {
		String s = "kolingkoangpap";
//		char charAt(int index)   ����index�����ַ�
		System.out.println(s.charAt(4));
//		char[] toCharArray()  ת�����ַ�����  �ô˷������б���
		char[] a = s.toCharArray();
		for(char b : a){
			System.out.println(b);
		}
//		���ظ��ַ�����s�е�һ�γ��ֵ��±�  int indexOf(String s) û�з���-1
		System.out.println(s.indexOf("ko"));
		System.out.println(s.indexOf(97));
//		���ظ��ַ�����s�����һ�γ��ֵ��±�int  lastIndexOf(String s)  û�з���-1
		System.out.println(s.lastIndexOf("ko"));
//		��ָ��λ�ÿ�ʼѰ�Ҹ��ַ���һ�γ��ֵ�λ�� int lastIndexOf(String s,int a) û�з���-1
		System.out.println(s.indexOf("ko", 3));
//		��ȡ�ַ����ĳ��� int length()  �����ô˷������  charAt()  toCharArrar()�������б���
		System.out.println(s.length());
//		����1
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			System.out.println(c);
		}
//		����2
		char[] ch = s.toCharArray();
		for(int i = 0;i<s.length();i++){
			System.out.println(ch[i]);
		}
//		ȥ���ַ���ǰ��ո� void trim(String s)  �м�ո��޷�ȥ��
		String s1 = "  123  ";
		System.out.println(s1);
		System.out.println(s1.trim());
//		���ո�ȥ���� ��Stringת����int��
		int i = Integer.parseInt(s1.trim());
		System.out.println(i);
//		���ݸ������ַ�������ַ���  String[] split(String s) ��ֳ�һ��String��������
		String s2 = "2017-12-13";
		String[] str = s2.split("-");
		for(String s3: str){
			System.out.println(s3);
		}
//		���ַ���ȫ��ת���ɴ�д
		String s4 = "AbCdEfG";
		System.out.println(s4);
		System.out.println(s4.toUpperCase());
//		���ַ���ȫ��ת����Сд	
		System.out.println(s4.toLowerCase());
//		ת����Сд��Ӧ��  ��֤�룺��Сд����
//		��֤��  
		String  s5 = "AcSdNpO";
//		�û�����
		String s6 = "acsdnpo";
//		�����ж�(ת���ɴ�Сд����)
		System.out.println(s5.toLowerCase().equals(s6.toLowerCase()));
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase()));
//		�ж��Ƿ��Ը����ַ�����β  boolean endsWith(String s)
		String s7 = "www.baidu.com.cn";
		System.out.println(s7.endsWith(".cn"));
//		�ж��Ƿ��Ը����ַ�����ͷ  boolean startsWith(String s)
		System.out.println(s7.startsWith("www."));
//		�ж��ַ������Ƿ���ڸ����ַ���   boolean contains(String s)
		System.out.println(s7.contains(".com"));
	}
}
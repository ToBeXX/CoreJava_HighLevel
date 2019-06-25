package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*1.һ��File��������˲���ϵͳ�е�һ���ļ������ļ���
������File���󴴽���ɾ��һ���ļ�
������File���󴴽���ɾ��һ�����ļ���
��һ��File������������ʱ��ϵͳ�϶�Ӧ���ļ������ļ��в���ɾ��*/
class TestMyFile{
	public static void main(String[] args) throws IOException {
		File file;
		/*FileOutputStream fos = new FileOutputStream("file");
		FileInputStream fin = new FileInputStream("file");*/
		file = new File("hello.txt");
		System.out.println(file.exists());
		if(file.exists()) System.out.println(file.getAbsolutePath());
		else {
			System.out.println("�����ڸ��ļ�");
			file.createNewFile();
		}
	}
}
//������
/*����FileInputStream��˵���ӷ������֣������������������ݵ�λ�Ϸ������ֽ���
�ӹ����Ϸ֣����ǽڵ�����*/

/*������
FileInputStream���������ص�read���������У�
1.�޲ε�read��������ֵΪint�ͣ���ʾ��ȡ��ֵ
2.int read(byte[] bs)��������ֵ��ʾ��ȡ�����ݸ��� �����ļ�ĩβ����-1��������ʾ���뵽һ��byte������
int read(byte[] b, int off, int len) 
�Ӵ��������н� len ���ֽڵ����ݴ�off�±꿪ʼ����һ�� byte ������*/ 

/*������
����FileInputStream������Ϊ�˶�ȡ�����ϵ��ļ�
����FileInputStream�����ǣ����Ӳ���϶�Ӧ���ļ������ڣ����׳�һ���쳣
����FileInputStream�����ܴ����ļ�
FileInputStream�����ȡ�ļ�ʱ������ֻ�ܶ�ȡ�ı��ļ����κ������ļ����ܶ�
*/

/*������
1.����FileOutputStream����ʱ�������Ӧ���ļ���Ӳ���ϲ����ڣ���ᴴ�����ļ���
����ڴ������Ѿ����ڣ��򴴽��ֽ��������
2.���ʹ��FileOutputStream(String path,boolean append)���췽������FileOutputStream����
�����ڶ�������Ϊtrue����Ч��Ϊ�ڸ��ļ��Ļ�����д�����ݣ�����FileOutputStreamʱ������쳣��*/

//������
class TestFileInputStream{
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("test.txt");
		try{
			System.out.println(fin.read());
			fin.close();
		}catch(Exception e){}
	}
}
//��ʮ��
/*FileWrite : �ڵ��ַ������ �߱��򵥵�д����
PrintWrite ��������  Ч�ʿ�
����FileOutStream ͨ�� OutputStreamWriter ͨ����ת�����ܹ�������������*/

/*��11��
�ַ���
�ֽ���
�ֽ���
�ֽ���
�ֽ���*/

/*��12��
ObjectInputStream         д���� �ֽ���
ObjectOutputStream        ������ �ֽ���
BufferedInputStream       ���幦�� �ֽ���
BufferedOutputStream       ���幦�� �ֽ���
DataInputStream          д���ֻ������� 
DataOutputStream         �����ֻ������� 
PrintWriter              ���幦�� �ַ��� ����һ��
printStream               
BufferedReader           ���幦�� �ַ���
*/
/*
��13��
Ϊ������ĳ�����ܹ������л���Ҫ��ʵ��Serialization�ӿ�
Ϊ���ܹ���ĳ���������Բ��������л���Ӧ��ʹ��transizen���η�*/




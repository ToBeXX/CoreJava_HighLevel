package day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
	public static void main(String[] args) throws IOException {
		//����һ���ļ��ֽ������
		//���� �ļ�·��
		FileOutputStream fs = new FileOutputStream("file/a.txt");
		//д����
		/*fs.write(65);
		fs.write(66);
		fs.write(67);
		fs.write(68);*/
		byte[] b = {65,66,67,68};
		fs.write(65);
//		wite(byte[] b,int off,int len)  ��b������±�off��ʼ����Ϊlen���ַ�д���ļ���
		fs.write(b,0,3);
//		fs.write(b, 1, 3);
		//�ر���Դ
		fs.close();
		//����������
		FileOutputStream f = new FileOutputStream("file\\b.txt");
		//����д����
		byte[] a = {97,109};
//		f.write(a);
		f.write(a);
		//�ر���Դ
		f.close();
//		����һ���ļ��ֽ�����������
		FileInputStream f1 = new FileInputStream("file\\c.txt");
		FileOutputStream f2 = new FileOutputStream("file\\f.txt");
		/*while(true){
			int a1 = f1.read();
			if(a1 == -1) break;
			System.out.println((char)a1);
		}*/
//		����һ���ֽ�����
//		byte[] byt = new byte[13] ;
//		����������ݴ������±�2λ�ÿ�ʼ����  ����9��   ����ֵ
//		int a1 =f1.read(byt);
//		System.out.println(a1);
		/*for(byte b1 : byt){
			System.out.println((char)b1);
		}
		f2.write(byt);
		f1.close();
		f2.close();*/
//		��һ���ļ�����������һ���ļ�
		while(true){
		int a1 = f1.read();
		if(a1 == -1) break;
		System.out.println((char)a1);
		f2.write(a1);
	}
	}
}

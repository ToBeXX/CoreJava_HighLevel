package day22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
	public static void main(String[] args) throws IOException {
		//1.�����ļ��ֽ������
				FileOutputStream fos = new FileOutputStream("file/b.txt");
				//2.ʹ�ö����װ����� ������а�װ
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//3.д����
				oos.writeChars("hakshdfjkasdhfkf");
//				TestStudent student = new TestStudent("huangjiah",38);
//				oos.writeObject(student);
				//4.�ر���Դ
				oos.close();
	}
}

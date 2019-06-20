package day22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
	public static void main(String[] args) throws IOException {
		//1.创建文件字节输出流
				FileOutputStream fos = new FileOutputStream("file/b.txt");
				//2.使用对象包装输出流 对其进行包装
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//3.写操作
				oos.writeChars("hakshdfjkasdhfkf");
//				TestStudent student = new TestStudent("huangjiah",38);
//				oos.writeObject(student);
				//4.关闭资源
				oos.close();
	}
}

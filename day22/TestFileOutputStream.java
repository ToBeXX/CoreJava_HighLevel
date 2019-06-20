package day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
	public static void main(String[] args) throws IOException {
		//创建一个文件字节输出流
		//参数 文件路径
		FileOutputStream fs = new FileOutputStream("file/a.txt");
		//写操作
		/*fs.write(65);
		fs.write(66);
		fs.write(67);
		fs.write(68);*/
		byte[] b = {65,66,67,68};
		fs.write(65);
//		wite(byte[] b,int off,int len)  将b数组从下标off开始长度为len的字符写进文件夹
		fs.write(b,0,3);
//		fs.write(b, 1, 3);
		//关闭资源
		fs.close();
		//创建流对象
		FileOutputStream f = new FileOutputStream("file\\b.txt");
		//进行写操作
		byte[] a = {97,109};
//		f.write(a);
		f.write(a);
		//关闭资源
		f.close();
//		创建一个文件字节输入流对象
		FileInputStream f1 = new FileInputStream("file\\c.txt");
		FileOutputStream f2 = new FileOutputStream("file\\f.txt");
		/*while(true){
			int a1 = f1.read();
			if(a1 == -1) break;
			System.out.println((char)a1);
		}*/
//		创建一个字节数组
//		byte[] byt = new byte[13] ;
//		将读入的内容从数组下标2位置开始放置  放置9个   返回值
//		int a1 =f1.read(byt);
//		System.out.println(a1);
		/*for(byte b1 : byt){
			System.out.println((char)b1);
		}
		f2.write(byt);
		f1.close();
		f2.close();*/
//		从一个文件拷贝到另外一个文件
		while(true){
		int a1 = f1.read();
		if(a1 == -1) break;
		System.out.println((char)a1);
		f2.write(a1);
	}
	}
}

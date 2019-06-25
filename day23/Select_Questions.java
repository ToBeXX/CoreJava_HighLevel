package day23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*1.一个File对象代表了操作系统中的一个文件或者文件夹
可以用File对象创建和删除一个文件
可以用File对象创建和删除一个空文件夹
当一个File对象被垃圾回收时，系统上对应的文件或者文件夹不会删除*/
class TestMyFile{
	public static void main(String[] args) throws IOException {
		File file;
		/*FileOutputStream fos = new FileOutputStream("file");
		FileInputStream fin = new FileInputStream("file");*/
		file = new File("hello.txt");
		System.out.println(file.exists());
		if(file.exists()) System.out.println(file.getAbsolutePath());
		else {
			System.out.println("不存在该文件");
			file.createNewFile();
		}
	}
}
//第三题
/*对于FileInputStream来说，从方向来分，他是输入流，从数据单位上分他是字节流
从功能上分，他是节点流。*/

/*第四题
FileInputStream有三个重载的read方法，其中：
1.无参的read方法返回值为int型，表示读取的值
2.int read(byte[] bs)方法返回值表示读取的数据个数 到达文件末尾返回-1；参数表示读入到一个byte数组中
int read(byte[] b, int off, int len) 
从此输入流中将 len 个字节的数据从off下标开始读入一个 byte 数组中*/ 

/*第五题
创建FileInputStream对象是为了读取磁盘上的文件
创建FileInputStream对象是，如果硬盘上对应的文件不存在，则抛出一个异常
利用FileInputStream对象不能创建文件
FileInputStream对象读取文件时，不是只能读取文本文件，任何类型文件都能读
*/

/*第六题
1.创建FileOutputStream对象时，如果对应的文件在硬盘上不存在，则会创建该文件；
如果在磁盘上已经存在，则创建字节输出流；
2.如果使用FileOutputStream(String path,boolean append)构造方法创建FileOutputStream对象
并给第二个参数为true，则效果为在该文件的基础上写入内容，创建FileOutputStream时会出现异常。*/

//第七题
class TestFileInputStream{
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("test.txt");
		try{
			System.out.println(fin.read());
			fin.close();
		}catch(Exception e){}
	}
}
//第十题
/*FileWrite : 节点字符输出流 具备简单的写功能
PrintWrite ：缓冲流  效率快
利用FileOutStream 通过 OutputStreamWriter 通过桥转换，能够避免乱码问题*/

/*第11题
字符流
字节流
字节流
字节流
字节流*/

/*第12题
ObjectInputStream         写对象 字节流
ObjectOutputStream        读对象 字节流
BufferedInputStream       缓冲功能 字节流
BufferedOutputStream       缓冲功能 字节流
DataInputStream          写八种基本对象 
DataOutputStream         读八种基本对象 
PrintWriter              缓冲功能 字符流 读入一行
printStream               
BufferedReader           缓冲功能 字符流
*/
/*
第13题
为了能让某对象能够被序列化，要求实现Serialization接口
为了能够让某个对象属性不参与序列化，应当使用transizen修饰符*/




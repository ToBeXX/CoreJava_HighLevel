package day_6_22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestBuffer {
	public static void main(String[] args) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		FileInputStream fis = new FileInputStream("file/04_对象和类.wmv");
		FileOutputStream fos = new FileOutputStream("file/04_对象和类_copy.wmv");
		FileChannel channel = fis.getChannel();
		FileChannel channel1 = fos.getChannel();
		long start = System.currentTimeMillis();
		while(true){
			int a = channel.read(buffer);
			if(a == -1) break;
			buffer.flip();
			channel1.write(buffer);
			buffer.clear();
		}
		channel.close();
		channel1.close();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println("===========最高效Buffer复制文件===========");
		FileInputStream fis1 = new FileInputStream("file/04_对象和类.wmv");
		FileOutputStream fos1 = new FileOutputStream("file/04_对象和类_copy3.wmv");
		FileChannel channel2 = fis1.getChannel();
		FileChannel channel3 = fos1.getChannel();
		
		long b = channel2.transferTo(0, channel2.size(), channel3);
		long a  = channel3.transferFrom(channel2, 0, channel2.size());
		System.out.println(b);
		System.out.println(a);
		long start1 = System.currentTimeMillis();
		
		channel2.close();
		channel3.close();
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
	}
}

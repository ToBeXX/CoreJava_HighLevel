package day23;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
//		创建一个File对象  代表文件夹或者文件
		File f = new File("E:\\MyEclipse\\WorkSpace\\CoreJava\\file2");
//		创建文件夹
		f.mkdir();
//		创建file对象
		File f1 = new File("E:\\MyEclipse\\WorkSpace\\CoreJava\\file2\\a.txt");
//		创建文件
		f1.createNewFile();
//		重命名
		File f2 = new File("E:\\MyEclipse\\WorkSpace\\CoreJava\\file2\\a(1).txt");
		f1.renameTo(f2);
//		判断该路径是文件 / 文件夹
		System.out.println(f.isFile());
		System.out.println(f1.isDirectory());
//		输出绝对路径
		System.out.println(f.getAbsoluteFile());
		System.out.println(f1.getAbsolutePath());
//		判断文件是否存在
		System.out.println(f2.exists());
//		获取文件夹下所有文件
		 File f3 = new File("E:\\MyEclipse");
		 File[] fl = f3.listFiles();
		 for(File a : fl){
			 System.out.println(a.getName());
		 }
		 listJavaFile(f3);
	}
//	递归查找以.java后缀结尾的文件
	static void listJavaFile(File files){
//		实现FileFilter接口    覆盖accept方法
		File[] fis = files.listFiles(new FileFilter() {
			public boolean accept(File f) {
				if(f.isDirectory()) return true;
				if(f.isFile()){
					String name = f.getName();
					return name.endsWith(".java");
				}
				 return false;
			}
		});
		for(File f : fis){
			if(f.isFile()) System.out.println(f.getAbsolutePath());
			else listJavaFile(f);
		}
	}
}

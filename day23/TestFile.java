package day23;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
//		����һ��File����  �����ļ��л����ļ�
		File f = new File("E:\\MyEclipse\\WorkSpace\\CoreJava\\file2");
//		�����ļ���
		f.mkdir();
//		����file����
		File f1 = new File("E:\\MyEclipse\\WorkSpace\\CoreJava\\file2\\a.txt");
//		�����ļ�
		f1.createNewFile();
//		������
		File f2 = new File("E:\\MyEclipse\\WorkSpace\\CoreJava\\file2\\a(1).txt");
		f1.renameTo(f2);
//		�жϸ�·�����ļ� / �ļ���
		System.out.println(f.isFile());
		System.out.println(f1.isDirectory());
//		�������·��
		System.out.println(f.getAbsoluteFile());
		System.out.println(f1.getAbsolutePath());
//		�ж��ļ��Ƿ����
		System.out.println(f2.exists());
//		��ȡ�ļ����������ļ�
		 File f3 = new File("E:\\MyEclipse");
		 File[] fl = f3.listFiles();
		 for(File a : fl){
			 System.out.println(a.getName());
		 }
		 listJavaFile(f3);
	}
//	�ݹ������.java��׺��β���ļ�
	static void listJavaFile(File files){
//		ʵ��FileFilter�ӿ�    ����accept����
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

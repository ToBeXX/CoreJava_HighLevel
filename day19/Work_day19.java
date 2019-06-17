package day19;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* 
 * д���쳣���༰�ص�
 * RuntimeException ����ʱ�쳣��δ����쳣�����������ᱨ������ʱ�����ɴ���ɲ��ɴ������Ա���
 * ��RuntimeException ������ʱ�쳣�����Ѽ���쳣������ʱ�������봦��
 */
class Test2{
	public static void main(String[] args) {
			m1();
		}
	public static void m1(){
			System.out.println("m1--------start");
			System.out.println("m1--------end");
	} 
	public static void m2(){
		System.out.println("m2--------start");
		System.out.println("m2--------end");
	} 
	public static void m3(){
		System.out.println("m3--------start");
		System.out.println("m3--------end");
	} 
	public static void m4(){
		System.out.println("m4--------start");
		System.out.println("m4--------end");
	} 
}
//������
class Test3{
	public static void main(String[] args) throws ArithmeticException{
		m1();
	}
	public static void m1() throws ArithmeticException {
		throw new ArithmeticException();
	}
}
class Test4{
	public static void main(String[] args) throws ClassCastException{
		m1();
	}
	public static void m1() throws ClassCastException {
		throw new ClassCastException();
	}
}
class Test5{
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		m1();
	}
	public static void m1() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}
}
class Test6{
	public static void main(String[] args) throws StringIndexOutOfBoundsException{
		m1();
	}
	public static void m1() throws StringIndexOutOfBoundsException {
		throw new StringIndexOutOfBoundsException();
	}
}
class Test7{
	public static void main(String[] args) throws NoSuchElementException{
		m1();
	}
	public static void m1() throws NoSuchElementException{
		throw new NoSuchElementException();
	}
}
class Test8{
	public static void main(String[] args) throws NullPointerException{
		m1();
	}
	public static void m1() throws NullPointerException{
		throw new NullPointerException();
	}
}
class Test9{
	public static void main(String[] args) throws NumberFormatException{
		m1();
	}
	public static void m1() throws NumberFormatException{
		throw new NumberFormatException();
	}
}
class Test10{
	public static void main(String[] args) throws InputMismatchException{
		m1();
	}
	public static void m1() throws InputMismatchException{
		throw new InputMismatchException();
	}
}
class Test11{
	public static void main(String[] args) throws ClassNotFoundException{
		m1();
	}
	public static void m1() throws ClassNotFoundException{
		throw new ClassNotFoundException();
	}
}
class Test12{
	public static void main(String[] args) throws FileNotFoundException{
		m1();
	}
	public static void m1() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
}
class Test3_1{
	public static void main(String[] args){
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void m1(){
		throw new ArithmeticException();
	}
}
class Test12_1{
	public static void main(String[] args){
		try {
			new FileNotFoundException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Exception_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try{
			ma(a);
		}catch(EOFException e){
			System.out.println("EOFException�Ѵ���");
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException�Ѵ���");
		}catch(SQLException e){
			System.out.println("SQLException�Ѵ���");
		}catch(NullPointerException e){
			System.out.println("NullPointerException�Ѵ���");
		}finally{
			System.out.println("in finally");
		}
	}
	public static void ma(int n) throws EOFException,FileNotFoundException,SQLException,NullPointerException{
		System.out.println("ma----------start");
		if(n == 1) throw new EOFException();
		if(n == 2) throw new FileNotFoundException();
		if(n == 3) throw new SQLException();
		if(n == 4) throw new NullPointerException();
	}
}
/*
 * ma----------start
 * EOFException�Ѵ���
 * in finally
 * ma----------start
 * FileNotFoundException�Ѵ���
 * in finally
 * ma----------start
 * SQLException�Ѵ���
 * in finally
 * ma----------start
 * NullPointerException�Ѵ���
 * in finally
 * ma----------start
 * in finally
 */
//��ʮ����
class MyException1 extends IOException{
	
	public MyException1() {
		super();
	}
	public MyException1(String message) {
		super(message);
	}
}
class MyException2 extends RuntimeException{
	public MyException2() {
		super();
	}
	public MyException2(String message) {
		super(message);
	}
}
//��17��
class TestMyException{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		try{
			m(n);
		}catch(MyException1 ex1){
			ex1.printStackTrace();
		}catch(MyException2 ex2){
			ex2.printStackTrace();
			throw ex2;
		}
	}
	public static void m(int n) throws MyException1,MyException2{
		if(n == 1){
			System.out.println("n == 1");
			throw new MyException1();
		}else{
			System.out.println("n == 2");
			throw new MyException2();
		}
	}
}
//��19��
class MyException extends Exception{}
class TestExcrption{
	public static void main(String[] args){
		ma();
	}
	public static int ma(){
		try {
			m();
			return 100;
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
			return 10;
		}catch(Exception e){
			System.out.println("Exception");
			return 1;
		}
	}
	public static void m()throws MyException{
		throw new MyException();
	}
}
//��20��
class Super{
	public void ma() throws IOException{}
}
interface IA{
	void mb();
}
class MySub extends Super implements IA{
	public void ma(){}
	public void mb(){}
}
//��21��
class TryCatch{
	public static void main(String[] args) {
		System.out.println(ma());
	}
	public static int ma(){
		int n ;
		try{
			n = 10/0;
		}catch(Exception e){
			
		}
		return 0;
	}
}
//���벻ͨ��
//��22��
class TestFinally{
	public static void main(String[] args) {
		System.out.println(ma());
	}
	public static int ma(){
		int b;
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		try {
			int n = 100;
			return n/b;
		}catch(Exception e){
			return 10;
		}finally{
			return 100;
		}
	}
}
// 100  100
//��23��
class TestTryFinally{
	public static void main(String[] args) {
		try {
			ma();
		}catch(Exception e){}
	}
	public static void ma() throws Exception{
		int n = 10;
		int b;
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		try{
			System.out.println("ma1");
			int result = n/b;
			System.out.println("ma2  "+ result);
		}finally{
			System.out.println("In Finally");
		}
	}
}
/*10
ma1
ma2  1
In Finally
0
ma1
In Finally
*/
class MySuper{
	public void m() throws IOException{}
}
class MySub1 extends MySuper{
	public void m() throws EOFException{}
}
class MySub2 extends MySub1{
	public void m() throws EOFException{}
}
//���벻ͨ��  ���಻���׳��ȸ��������쳣
class TestException1{
	public static void main(String[] args) {
		try{
			System.out.println("main1");
			ma();
			System.out.println("main2");
		}catch(Exception e){
			System.out.println("In Catch");
		}
	}
	public static void ma(){
		System.out.println("ma1");
		throw new NullPointerException();
//		System.out.println("ma2");
	}
}
//�������   
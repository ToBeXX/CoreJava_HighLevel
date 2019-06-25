package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9001);
		while(true){
			Socket s = ss.accept();
			Thread t = new MyThread(s);
			t.start();
		}
	}
}
class MyThread extends Thread{
	private Socket s;
	public MyThread(Socket s) {
		super();
		this.s = s;
	}
	public void run(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String line = br.readLine();
			System.out.println(line);
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			pw.println(line + " from server");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
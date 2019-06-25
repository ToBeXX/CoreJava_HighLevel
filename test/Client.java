package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.40.120",9000);
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.println("Hello Cilent");
		pw.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = br.readLine();
		System.out.println(line);
		s.close();
	}
}

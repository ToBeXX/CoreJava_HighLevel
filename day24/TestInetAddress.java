package day24;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			String localName = inetAddress.getHostName();
			String localip = inetAddress.getHostAddress();
			System.out.println("��������"+localName);
			System.out.println("����ip��ַ��"+localip);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

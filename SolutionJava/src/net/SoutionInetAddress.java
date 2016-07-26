package net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SoutionInetAddress {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
			System.out.println(inetAddress.isReachable(3000));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

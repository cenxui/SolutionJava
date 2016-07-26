package net;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class SolutionNetworkInterface {

	public static void main(String[] args) throws SocketException {
		Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) {
        	displayInterfaceInformation(netint);
        }     
	}
	
	static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        System.out.printf("Display name: %s\n", netint.getDisplayName());
        System.out.printf("Name: %s\n", netint.getName());
        System.out.printf("Virtual: %s\n", netint.isVirtual());
        System.out.printf("Loopback: %s\n", netint.isLoopback());
        System.out.printf("PointToPoint: %s\n", netint.isPointToPoint());
        System.out.printf("IsRunning: %s\n", netint.isUp());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
        	 System.out.printf("InetAddress: %s\n", inetAddress);
        }
        System.out.printf("\n");
     }


}

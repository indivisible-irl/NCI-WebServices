package t02_inetaddressing;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddrDemo {
	
	public static void main(String args[]) {
        System.out.println ("Looking up the IP address of the local host");
        try {
            // Get the local host
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("IP address of this machine: " +localAddress.getHostAddress());
        } catch (UnknownHostException uhe) {
            System.out.println ("Error - unable to resolve localhost");
        }
	}
}

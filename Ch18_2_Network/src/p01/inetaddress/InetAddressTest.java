package p01.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		InetAddress ia = null;
		try {
			ia = InetAddress.getLocalHost();
			System.out.println(ia);
			InetAddress ia2 = InetAddress.getByName("www.naver.com");
			System.out.println(ia2);
			InetAddress[] in = InetAddress.getAllByName("www.google.com");
			for (InetAddress k : in)
				System.out.println(k);
		} catch (UnknownHostException e) {

		}

		System.out.println("Done");
	}

}

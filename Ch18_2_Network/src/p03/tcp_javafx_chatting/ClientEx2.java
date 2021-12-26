package p03.tcp_javafx_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx2 {

	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("127.0.0.1", 5500);// 127.0.0.1: 나의pc
			Thread t1=new SenderThread(s);
			Thread t2 = new RecieverThread(s);
			t1.start();
			t2.start();


		} catch (UnknownHostException e) {

		} catch (IOException e) {

		}
//		try {
//			s.close();
//		} catch (IOException e) {
//
//		}

	}

}

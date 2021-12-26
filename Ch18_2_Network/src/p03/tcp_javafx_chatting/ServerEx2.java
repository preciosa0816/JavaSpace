package p03.tcp_javafx_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
	public static void main(String[] args) {
		ServerSocket sk = null;
		Socket s = null;
		try {
			sk = new ServerSocket(5500); // 포트번호 임의설정
			s = sk.accept();

			Thread t1=new SenderThread(s);
			Thread t2 = new RecieverThread(s);
			t1.start();
			t2.start();

		} catch (IOException e) {

		}

		try {
			sk.close();
			//s.close(); //소켓은 계속 살아있어야함
		} catch (IOException e) {

		}
	}
}

package p02.tcp_serversocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx1 {

	public static void main(String[] args) {
		Socket s = null;
		try {

			s = new Socket("127.0.0.1", 9000);//127.0.0.1: 나의pc
			// Socket s = new Socket("localhost", 9000);

			InputStreamReader in = new InputStreamReader(s.getInputStream());// 파일을 가져와서 버퍼에 저장하기
			BufferedReader r = new BufferedReader(in);

			PrintWriter w = new PrintWriter(s.getOutputStream());
			w.println("Hello, Server(211.183.8.23)");// 데이터 송신
			w.flush();
			String str = r.readLine();// 데이터 수신
			System.out.println(str);

		} catch (UnknownHostException e) {

		} catch (IOException e) {

		}
		try {
			s.close();
		} catch (IOException e) {

		}

	}

}

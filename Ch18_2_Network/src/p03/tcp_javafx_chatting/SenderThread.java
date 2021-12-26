package p03.tcp_javafx_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//메세지를 송신하는 스레드 클래스
public class SenderThread extends Thread {

	Socket s;

	public SenderThread(Socket s) {
		super();
		this.s = s;
	}

	public SenderThread(Socket s, String s2) {

	}

	@Override
	public void run() {
		try {
			InputStreamReader in = new InputStreamReader(System.in);// 파일을 가져와서 버퍼에 저장하기
			BufferedReader r = new BufferedReader(in);

			PrintWriter w = new PrintWriter(s.getOutputStream());
			while (true) {
				String str = r.readLine();// 데이터 수신
				if (str.equals("bye"))
					break;
				w.println(str);
				w.flush();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			s.close();
		} catch (IOException e) {

		}
	}

}

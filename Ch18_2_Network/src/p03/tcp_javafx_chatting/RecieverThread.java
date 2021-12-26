package p03.tcp_javafx_chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//수신스레드
public class RecieverThread extends Thread {
	Socket s;

	public RecieverThread(Socket s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		try {
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader r = new BufferedReader(in);

			while (true) {
				String str = r.readLine();
				if (str == null)
					break;
				System.out.println("수신> " + str);// 데이터 수신
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

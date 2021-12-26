package p02.tcp_serversocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {
//서버를 먼저수행시켜야함. 
	public static void main(String[] args) {
		//서브소켓 설계 -포트번호 설게 - 소켓설계
		ServerSocket sk =null;
		Socket s  =null;
		try {
			sk = new ServerSocket(9000); //포트번호 임의설정
			s = sk.accept();
			
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader r = new BufferedReader(in);
			
			//데이터 수신
			PrintWriter w = new PrintWriter(s.getOutputStream());
			String str = r.readLine();
			System.out.println(str);
			
			//서버에서 클라이언트에 보낼 내용(데이터 송신)
			w.println("Hello, Client");
			w.flush();
			
		} catch (IOException e) {
			
		} 
		
		try {
			sk.close();
			s.close();
		} catch (IOException e) {
			
		}
	}

}

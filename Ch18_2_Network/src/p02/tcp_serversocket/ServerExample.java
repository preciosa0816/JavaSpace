package p02.tcp_serversocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
//ServerSocket : 클라이언트의 연결요청을 기다리면서 연결수락 담당
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {// ServerSocket 생성
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); 
			while (true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); //클라이언트가 연결 요청시 연결 수락후 통신용 socket 생성
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				
				byte[] bytes=null;
				String message = null;
				
				InputStream is=socket.getInputStream();
				bytes= new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]: "+message);
				
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch (IOException e) {

		}
		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {

			}
		}

	}

}

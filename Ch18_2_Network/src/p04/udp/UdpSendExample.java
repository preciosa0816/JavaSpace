package p04.udp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSendExample {

	public static void main(String[] args) throws IOException {
		DatagramSocket datagreamSocket = new DatagramSocket(); //Datagram Socket 생성
		
		System.out.println("[발신 시작]");
		
		for(int i=1;i<3;i++) {
			String data="메시지"+i;
			byte[] byteArr = data.getBytes("UTF-8");
			
			DatagramPacket packet = new DatagramPacket(//Datagram Packet 생성
					byteArr, byteArr.length, new InetSocketAddress("localhost",5001));
			
			datagreamSocket.send(packet); //DatagramPacket 전송
			System.out.println("[보낸 바이트 수] :"+byteArr.length+" bytes");
		}
		System.out.println("[발신 종료]");
		
		datagreamSocket.close(); //DatagramSocket 닫기
	}

}

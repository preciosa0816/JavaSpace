package p04.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveExample extends Thread {
//실행 후 10초가 지나면 수신자 종료
	public static void main(String[] args) throws SocketException, InterruptedException {

		// 5001번 포트에서 수신하는 DatagramSocket 생성
		DatagramSocket datagramSocket = new DatagramSocket(5001);

		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[수신 시작]");

				try {
					while (true) { // DatagramPacket 수신
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						
						//receive():패킷 읽을 준비, 패킷을 받을 때 까지 블로킹, 패킷이 도착하면 매개값으로 주어진 DatagramPacket에 패킷내용 저장
						datagramSocket.receive(packet);

						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[받은 내용: " + packet.getSocketAddress() + "]" + data);
					}
				} catch (IOException e) {
					System.out.println("[수신 종료]");
				}

			}
		};
		thread.start();

		Thread.sleep(10000);
		datagramSocket.close();

	}

}

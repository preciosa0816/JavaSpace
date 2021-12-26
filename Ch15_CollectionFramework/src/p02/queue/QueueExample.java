package p02.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSms", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));
	
		System.out.println(messageQueue);
		
		while(!messageQueue.isEmpty()) {
			Message me = messageQueue.poll(); //리턴 후 삭제됨
			switch (me.command) {
			case "sendMail":
				System.out.println(me.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSms":
				System.out.println(me.to+"님에게 문자를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(me.to+"님에게 카톡을 보냅니다.");
				break;

			}
			
		}System.out.println(messageQueue);
	}

}

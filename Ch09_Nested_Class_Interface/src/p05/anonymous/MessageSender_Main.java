package p05.anonymous;

public class MessageSender_Main {

	public static void main(String[] args) {

		// 1. 기존 객체 생성 방법
		EmailSender es = new EmailSender("홍길동", "알파고");

		es.send("굿모닝(email)");

		SMSSender s = new SMSSender("010-4567-1289", "02-789-4561");

		s.send("굿모닝(SMS)");

		// 2. 중첩클래스(Nested Class)방법
		// SatelliteSender - local Inner Class

		class SatelliteSender extends MessageSender {
			@Override
			void send(String message) {

				System.out.println("발신 : 홍길동");
				System.out.println("수신 : 알파고");
				System.out.println("내용 : " + message);
				System.out.println();

			}
		}
		SatelliteSender sa = new SatelliteSender();
		sa.send("굿모닝(Satellite)");

		// 3. 익명클래스 방법
//		class SatelliteSender extends MessageSender { // 2번방법을 부모의 눈으로 생성된자기를 바라보는 방법으로 변화
		MessageSender me = new MessageSender() {
			@Override
			void send(String message) {

				System.out.println("발신 : 홍길동");
				System.out.println("수신 : 알파고");
				System.out.println("내용 : " + message);
				System.out.println();

			}
		};
		// SatelliteSender sa = new SatelliteSender(); //객체생성 할 필요가 없음 메모리 차지x
		me.send("굿모닝(Satellite)");

	}

}

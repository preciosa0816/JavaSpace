package p07.study.Ex6;

public class Chatting {
	
	public static void main(String[] args) {
		Chatting ch = new Chatting();
		ch.startChat("알파고");
		
		
	}
	
	
	
	//익명클래스(구현객체)가 메소드 안에 있는 경우 파라미터, 로컬변수에는 final 생략(고정상수임)
	void startChat(String chatId) {
		//String nickName = null;					//이를 주석처리하면 에러가 나지 않는다.
		String nickName = chatId;				//final을 넣어야함(Java8에서는 final이 생략되어있으므로 String만 넣어줌)		

		
		//Local Inner Class
		//익명클래스
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData; //nickname은 final이어야하는데 그렇지 않아서 발생했다.
					sendMessage(message);
					break;//반복문장빠져나오기 
				}
			}
		};
		chat.start();
	}
	//Instance inner class
	class Chat	{

		void start() {
		}

		void sendMessage(String message) {
			System.out.println(message);
		}
	}

}

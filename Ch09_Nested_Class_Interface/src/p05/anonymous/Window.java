package p05.anonymous;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값 으로 대입
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("call!");			//필드 선언과 초기값 대입
			
		}
	};
	
	Window(){
		button1.setListener(listener);
		button2.setListener(new Button.OnClickListener() {	//매개값으로 필드 대입
			
			@Override
			public void onClick() {	
				System.out.println("send a message");		//매개갑으로 익명 구현 객체 대입
				
			}
		});
		
	}
}

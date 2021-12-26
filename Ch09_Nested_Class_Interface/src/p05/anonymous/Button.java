package p05.anonymous;

public class Button {
	
	
		OnClickListener listener; //인터페이스 타입 필드
		
		//setter()
		public void setListener(OnClickListener listener) {	//매개 변수의 다형성
			this.listener = listener;
			
	
	}
	//일반메소드
		void touch() {					//구현 객체의 onClick()메소드 호출
			listener.onClick();
		}
		
		//중첩인터페이스
		interface OnClickListener{		// 중첩 인터페이스
			void onClick ();
			
		}
}

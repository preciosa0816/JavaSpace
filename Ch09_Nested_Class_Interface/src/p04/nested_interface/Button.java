package p04.nested_interface;

public class Button {
	
	
		OnclickListener listener;
		
		//setter()
		public void setListener(OnclickListener listener) {
			this.listener = listener;
			
	
	}
	//일반메소드
		void touch() {
			listener.onClick();
		}
		
		//중첩인터페이스
		interface OnclickListener{
			void onClick ();
			
		}
}

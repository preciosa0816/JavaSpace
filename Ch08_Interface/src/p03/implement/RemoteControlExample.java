package p03.implement;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		//1. 익명구현
		
		RemoteControl rc1 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		
		//2. 
	}
	
}

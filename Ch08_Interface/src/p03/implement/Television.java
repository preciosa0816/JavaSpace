package p03.implement;

public class Television implements RemoteControl {
	
	private int volume;
	//추상메소드의 실체메소드
	@Override
	public void turnOn() {
		System.out.println("Turn on the TV");

	}
	
	//추상메소드의 실체메소드
	@Override
	public void turnOff() {
		System.out.println("Turn off the TV");

	}
	
	//추상메소드의 실체메소드
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=volume;
			
		}
		System.out.println("current TV volume: "+this.volume);

	}

}

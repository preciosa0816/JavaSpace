package p01.basic;

public class RemoteControl_impl implements RemoteControl {


	@Override
	public void turnOn() {
		System.out.println("켜기");

	}

	@Override
	public void turnOff() {
		System.out.println("끄기");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("볼륨 조정");

	}

	//default 메소드
	@Override
	public void setMute(boolean mute) {
		System.out.println("setMute() :: overriding");
		
	}


}

package p04.implement2;

import p03.implement.RemoteControl;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Turn on the TV");

	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the TV");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		
		System.out.println("Current Audio volume: "+ this.volume);

	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
		
		if(mute) {
			System.out.println("Audio silent");
		}else {
			System.out.println("Audio activate");
		}
	}

}

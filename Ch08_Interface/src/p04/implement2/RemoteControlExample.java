package p04.implement2;

import p03.implement.Audio;
import p03.implement.RemoteControl;
import p03.implement.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television(); // 부모클래스|자식클래스
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery(); // 정적메소드는 바로 호출가능
	}
}

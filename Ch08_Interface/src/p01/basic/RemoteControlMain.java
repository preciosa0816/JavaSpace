package p01.basic;

//인터페이스를 구현한 클래스(?)
public class RemoteControlMain {

	public static void main(String[] args) {
		//1. 객체생성
		RemoteControl_impl r = new RemoteControl_impl();//자식클래스객체생성
		r.turnOn();
		r.turnOff();
		r.setVolume(RemoteControl.MAX_VOLUME);
		r.setMute(false); //자식이 메소드를 오버라이딩 하면 자식것이 실행됨
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		RemoteControl.changeBattery();
		
		//2. 익명구현개체(Anonymous Interface)객체
		RemoteControl r2= new RemoteControl() {
			
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
				System.out.println("setMute2() :: overriding");
				
			}
			// default :인터페이스 안에서만 사용가능
//			default void add(int a) {
//				System.out.println("add");
//			}

		};
		
		System.out.println("--------------------");
		r2.turnOff();
		r2.turnOn();
		r2.setVolume(10);
		r2.setMute(false);
		
		//3. polymorphism(다형성) 을 사용 
		RemoteControl r3 = new RemoteControl_impl(); //부모 | 자식
		System.out.println(r3.MIN_VOLUME);
		r3.setMute(true); //Overriding 에 해당하는 내용이 보여질것
		
		
		
	}
}

package p01.basic;
//interface : 공통된 method를 추상메소드로 만들어서 구현된 자식클래스에서 재정의해서 사용.
//				(비교)추상클래스는 미완성 설계도 
// 				인터페이스는 : 추상화 더 심화된 밑그림만 그려져있는 설계도
//				구성요소 4가지
//				interface 자체 객채생성 불가 => 구현된 클래스(implement)를 사용(자식클래스)
//				인터페이스 간의 다중상속(O)


// interface앞에 "abstract" 생략가능
public interface RemoteControl {
	// 1.상수: Java7
	static final int MAX_VOLUME = 10; // class에서 상수 선언하기
	int MIN_VOLUME = 0; // interface에서는 "static final" 생략

	// 2.추상메소드 : 선언부만 있고 몸체가 x : 강제성, 일관성 : Java7
	abstract void turnOn(); 
				 void turnOff(); // interface에서는 "abstract" 생략가능
				 void setVolume(int volume);

	// 3. default method (Java8)
				 //구현된(implement;상속과 비슷한 의미) 클래스를 만들어서 재정의[body]해서 사용
				 //일반 메소드 역할: 인터페이스상태에서 사용(O) 재정의해서 사용(O)
	default void setMute(boolean mute) { //인터페이스에서 default를 지우면 error
		if (mute)
			System.out.println("무음 처리");
		else
			System.out.println("무음 해제");
	}

	
	// 4. static method(Java8)
	static void changeBattery() {
		System.out.println("건전지 교환");
	}

}

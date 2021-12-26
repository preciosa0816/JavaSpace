package p08.abstract_class;

import java.awt.image.SampleModel;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); // 추상클래스 객체생성불가
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		

	}

}

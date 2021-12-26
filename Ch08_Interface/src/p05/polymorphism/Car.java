package p05.polymorphism;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll(); //한국
		frontRightTire.roll();//한국
		backLeftTire.roll();//한국
		backRightTire.roll();//한국
		}
}

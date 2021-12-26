package p08.method;

public class CarNExample {

	public static void main(String[] args) {
		CarN myCar = new CarN();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: "+speed+"km/h");

	}

}

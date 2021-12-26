package p05.final_class_method;

public class SportCar extends Car {
	@Override
	public void speedUp() {
		speed+=10;
	}
	
	//stop 클래스는 final이기 때문에 오버라이딩 불가
}

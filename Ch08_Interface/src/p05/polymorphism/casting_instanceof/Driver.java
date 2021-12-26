package p05.polymorphism.casting_instanceof;

public class Driver {
	
	//인터페이스의 파라미터 다형성
	//instanceof : 형변환 가능여부 판별(상속여부)
	public void drive(Vehicle v) {
		if (v instanceof Bus) {
			Bus b = (Bus) v;
			b.checkFare();
		}
		System.out.println("----------------");
		v.run();
	}
}
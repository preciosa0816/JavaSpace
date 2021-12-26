package p05.polymorphism.casting_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver d = new Driver();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		d.drive(b);
		d.drive(t); //taxi에는 checkFare 함수가 없다.

	}

}

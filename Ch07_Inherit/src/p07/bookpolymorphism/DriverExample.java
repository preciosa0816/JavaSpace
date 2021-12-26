package p07.bookpolymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); //자식클래스
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 자동타입변환 : Vehicle vehicle = bus
		driver.drive(taxi); // 자동타입변환 : Vehicle vehicle = taxi

	}

}

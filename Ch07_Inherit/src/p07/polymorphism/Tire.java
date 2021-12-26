package p07.polymorphism;

public class Tire {
	// 필드
	public int maxRotation;
	public int accmulateRotation;
	public String location;

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		
	}

	// 메소드

	public boolean roll() {
		++accmulateRotation;
		if (accmulateRotation < maxRotation) {
			System.out.println(location + "Tire life: " + (maxRotation - accmulateRotation) + "times");
			return true;
		} else {
			System.out.println("*** " + location + " Tire punk ***");
			return false;
		}
	}

}

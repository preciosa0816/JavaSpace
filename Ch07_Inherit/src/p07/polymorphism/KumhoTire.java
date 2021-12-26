package p07.polymorphism;

public class KumhoTire extends Tire {
	// 필드

	// 생성자

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}

	@Override
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation<maxRotation) {
			System.out.println(location+"KumhoTire life: "+(maxRotation-accmulateRotation)+"times");
			return true;
		}else {
			System.out.println("*** "+location+"KumhoTire punk ***");
		return false;
		}
		
	}
}

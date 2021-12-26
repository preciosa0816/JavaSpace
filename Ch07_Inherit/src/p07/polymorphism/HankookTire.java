package p07.polymorphism;

public class HankookTire extends Tire {
//필드

	// 생성자

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	@Override
	public boolean roll() {
		++accmulateRotation;
		if(accmulateRotation<maxRotation) {
			System.out.println(location+"HankookTire life"+(maxRotation-accmulateRotation)+"times");
			return true;
		}else {
			System.out.println("*** "+location+"HankookTire punk ***");
		return false;
		}
		
	}

}

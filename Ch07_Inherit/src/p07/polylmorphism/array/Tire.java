package p07.polylmorphism.array;

public class Tire {
	public int maxRotation;
	public int accumulatedRotaion;
	public String location;
	
	public Tire(String location, int maxRotation  ) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	

	public boolean roll() {
		++accumulatedRotaion;//한회전씩 증가함
		if(accumulatedRotaion<maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotaion) + "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크 ***");
		}return false;
	}
}

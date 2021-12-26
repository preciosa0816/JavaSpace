package p09.instance;

public class Car {

	String model;
	int speed; // 0

	public Car(String model) {
		super();
		this.model = model;
	}

	public void setSpeed(int speed) { // static 이면 this 사용 x(인스턴스변수기떄문,메모리에 가기 때문)
		this.speed = speed;
	}

//5번, 시속 10씩 증가하는 메소드
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			setSpeed(i);
// 포르쉐가 달립니다. (시속 10km/h)
			System.out.println(model + "가 달립니다. (시속" + speed + "km/h)");
		}

	}
}
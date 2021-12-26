package p07.constructor;

public class CarExample {

	public static void main(String[] args) {
		Car c1 = new Car(); //자동으로 기본생성자만듦(물리적x)
		Car c2 = new Car("자가용"); 
		Car c3 = new Car("자가용","빨강"); 
		Car c4 = new Car("택시","검정",200); 
		

	}

}

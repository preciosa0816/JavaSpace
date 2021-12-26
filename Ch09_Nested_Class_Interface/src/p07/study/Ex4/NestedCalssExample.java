package p07.study.Ex4;

import p07.study.Ex4.Car.Engine;

public class NestedCalssExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		Car.Tire tire = mycar.new Tire();
		
		Car.Engine engine = new Car.Engine();

	}

}

package p07.study.Ex4;

//Outter class
public class Car {
	class Tire {// instance inner class
		public Tire() {
			System.out.println("Tire Class 기본생성자");
		}
	} 

	static class Engine {// static inner class
		public Engine() {
			System.out.println("Engine Class 기본생성자");
		}
	}

}

package p05.anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();

		// 익명객체필드사용
		annoy.field.turnOn();

		// 익명객체로컬변수사용
		annoy.method1();

		// 익명객체매개값 사용
		annoy.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Turn on the smart TV");

			}

			@Override
			public void turnOff() {
				System.out.println("Turn off the smart TV");

			}
		}

		);

	}

}

package p05.anonymous.class_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		a.p.wake();
		a.method1();

		// 방법1
		Person p1 = new Person();
		a.method2(p1);

		// 방법2
		Person p2 = new Person();
		a.method2(new Person() {
			void study() {
				System.out.println("공부하기~~");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
		// 방법2

	}

}

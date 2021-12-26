package p03.nested_class2;

public class A2 {

	int field1;

	// 인스턴스 메소드
	void method1() {}

	static int field2;

	static void method2() {}

	class B {
		void method() { // 모든 필드와 메소드에 접근할 수 있다.
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}

	static class C { // 인스턴스필드와 메소드는 접근할 수 없다.
		void method() {
			// field1 = 10; //인스턴스필드와 메소드는 접근할 수 없다.
			// method1(); //인스턴스필드와 메소드는 접근할 수 없다.

			field2 = 10;
			method2();
		}
	}

}

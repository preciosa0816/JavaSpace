package p07.study.Ex5;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();

		anony.method2(new Vehicle() {//파라미터 전달내용에다 인터페이스를 구현한 클래스 덩어리를 삽입함
													 //
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");

			}
		});

	}
}

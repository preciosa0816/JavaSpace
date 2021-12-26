package p04.nulls;

public class PointEx2 {

	public static void main(String[] args) {
		/*
		 * Point p1; 						//주소값 가르키지 않아서 에러 
		 * System.out.println(p1.x);
		 * System.out.println(p1.y);
		 */
		int b=0;//메소드 안에서 선언된 변수(참조, 기본형)는 반드시 초기화!
		Point p1 = null; //클래스타입의 기본값은 null (초기화를 위해 써야함)
								//컴파일 에러는 해결되었으나, 실행에러 발생
		//Point p1 = new Point(20, 30); // 서술 시 에러 해결.
		try {
			System.out.println(p1.x);
			System.out.println(p1.y);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("NullPointerException 발생~: 값이 들어 있지 않습니다.");
		}
		System.out.println("실행 정상적 종료");
		System.out.println("정상적 결과를 얻기 위해서는 객체생성해서 p1이 생성된 객체를 가리키면 됩니다");
	}

}

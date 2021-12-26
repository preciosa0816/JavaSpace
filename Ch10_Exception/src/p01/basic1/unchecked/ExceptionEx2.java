package p01.basic1.unchecked;

public class ExceptionEx2 {
	
	public static void a() {
		b();		
	}
	
	public static void b() {
		int num=3/0;
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//try~catch : 예외를 직접 처리
		try {
			a();
			//catch절에서 반드시 부모 클래스는 맨 나중에 작성
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		} catch (Exception e) {
		System.out.println("0으로 나눌 수 없습니다!!");
	} 
		System.out.println("Done");
	}
}

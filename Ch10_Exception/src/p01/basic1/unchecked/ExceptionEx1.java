package p01.basic1.unchecked;

//ERROR :  프로그램 수행시 의도하지 않게 발생되는 문제
//				치명적인 오류/Java에서 해결할 수 없는 오류		
//ERROR : Compile Error 
//			   Runtime Error
//Exception :  가벼운 오류/자바 개발자가 해결가능
//Exception : Compile Exception :Checked, 반드시작성(try~catch)
//			   Runtime Exception : unchecked, 개발자가 선택적으로 작성
//
public class ExceptionEx1 {
//Runtime Exception : 실행시 예외처리 하는 것.
	//try~catch or finally 선택적 사용
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		String name=null;
		try {//예외 발생 가능한 내용들
			//int num = 3 / 0;
			//System.out.println(num);
			System.out.println("문자열의 길이: " + name.length()); //위의 두줄을 주석해야 실행가능
			
		} catch (NullPointerException e) {//예외발생시 실행
			System.out.println(e.getMessage());

		} catch (ArithmeticException e) {//예외발생시 실행
			System.out.println("정수를 0으로 나눌 수 없습니다");
			// e.printStackTrace(); //예외에 대한 내용을 출력

		} catch (Exception e) {//예외발생시 실행
			System.out.println("일반적인 예외가 발생했습니다.");

		}finally {//반드시 실행됨
			System.out.println("Done1");
		}
		System.out.println("Done2");
		
	}

}

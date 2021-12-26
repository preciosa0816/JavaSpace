package p01.basic2.checked;

public class ExceptionEx7 {

	public static void main(String[] args) {
		int result; //double로 놓으면 에러발생하지 않는다.
		int[]  divide = {5,4,3,2,1,0};
		
		for (int i=0;i<10;i++) {
			//100/divide 결과값 출력
			
			try {
				result = 100/divide[i];
				System.out.println(result);
				
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				
			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열변수 첨자가 범위를 벗어났습니다.");
			
			} catch (NullPointerException e) {
				System.out.println("비어있습니다.");
			
			} catch (Exception e) {
				System.out.println("일반적인 오류");
			
		}

			
		}
		System.out.println("Done");
	}

}

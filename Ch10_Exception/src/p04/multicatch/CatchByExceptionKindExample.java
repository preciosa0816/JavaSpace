package p04.multicatch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {

		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result); //data1,2에 숫자 넣으면 실행됨
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");//현재 출력되는 것
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
			
		} catch (NumberFormatException e) { // data 1,2에 문자를 넣었을 때 실행됨
			System.out.println("숫자로 변환할 수 없습니다.");

		} finally {
			System.out.println("다시 실행하세요"); //data1,2에 숫자 넣으면 실행됨
		}

	}

}

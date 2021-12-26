package p07.userdefine;

public class Invalid_Main {

	public static void main(String[] args) {
		
		try {
			int result = subtract(5,10);
			System.out.println(result);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage()); //내가만든 예외의 문자열이 출력됨
		}catch (Exception e) {
		System.out.println("일반적인 예외");
		
	}
	}
	
	static int subtract(int a, int b) throws InvalidInputException {
		if(a<b)
			throw new InvalidInputException(); //checked Exception
		
		return a-b;
	
	}

}

package p02.runtime;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		
		System.out.println(data.toString()); //객체가 없는 상태에서 객체를 사용하려 해서 예외 발생

	}

}

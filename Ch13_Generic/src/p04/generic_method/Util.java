package p04.generic_method;

public class Util {
	//<T>:타입 파라미터 - 명시적으로 구체적 타입 지정
	public static <T> Box<T> boxing(T t) {// Box<T>라는 타입으로 반환
		
		Box<T> box = new Box<T>();
		box.setT(t);
		box.getT();
		
		return box;//// Box<T>라는 타입으로  출력
		
	}
	
	
	
}

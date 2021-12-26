package p12.wrapper;

public class WrapperEx1 {

	public static void main(String[] args) {
		byte grade=2;
		
		int marks = 50;
		float price = 8.6f;
		double rate = 50.5;
		
		//boxing : 기본형 타입을 참조형으로 변경
		System.out.println();
		//Wrapperclass (btye, integer....)
		Byte g1 = new Byte(grade);
		System.out.println(g1);
		Integer m1 = new Integer(marks); //객체생성
		Integer m2 = Integer.valueOf("100");//매소드사용
		
		System.out.println();
		
		//unboxing : 참조형=>기본형 변경
		Byte bv = g1.byteValue(); 
		
		int iv = m1.intValue();
		int iv2 = new Integer("100").intValue(); //다른 방법
		int iv3 = Integer.parseInt("100"); //문자열->int
		
		
		
		
	}

}

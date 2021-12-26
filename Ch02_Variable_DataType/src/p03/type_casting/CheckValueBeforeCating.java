package p03.type_casting;

public class CheckValueBeforeCating {

	public static void main(String[] args) {
		int i = (int) 128; //자동형변환
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)){
			System.out.println("byte type으로 변환 불가");
			System.out.println("값을 다시 확인해주세요");
		
		} else {
			byte b= (byte) i;
			System.out.println(b);
		}

	}
}

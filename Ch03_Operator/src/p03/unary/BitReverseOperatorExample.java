package p03.unary;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		
		BitReverseOperatorExample b = new BitReverseOperatorExample();
		
		int v1= 10;
		int v2=~v1; 		//~=not, -11
		int v3 =~v1+1;  //-10
		System.out.println(toBinaryString(v1)+"(십진수: "+v1+")");
		System.out.println(toBinaryString(v2)+"(십진수: "+v2+")");
		System.out.println(toBinaryString(v3)+"(십진수: "+v3+")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 +1;
		System.out.println(toBinaryString(v4)+"(십진수: " +v4+")");
		System.out.println(toBinaryString(v5)+"(십진수: " +v5+")");
		System.out.println(toBinaryString(v6)+"(십진수: " +v6+")");
				

	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);//static method, 객체생성x하고 사용
																 // 숫자를 넣으면 문자가 return됨(2진수)
		while(str.length()<32) {
			str="0" +str;
		}
		return str;
	}

}

package p03.unary;

public class BitReverseOperatorExample2 {

	public static void main(String[] args) {
		
		BitReverseOperatorExample2 b = new BitReverseOperatorExample2();
		
		//int v = 010; // 출력시 10 따라서 다음의 과정을 진행하는 것
		int v1= 10;
		int v2=~v1; 		//~=not, -11
		int v3 =~v1+1;  //-10
		
		System.out.println(b.toBinaryString(v1)+"(십진수:"+v1+")");
		System.out.println("--------------------------------------");
		System.out.println(b.toBinaryString(v2)+"(십진수:"+v2+")");
		System.out.println("--------------------------------------");
		System.out.println(b.toBinaryString(v3)+"(십진수:"+v3+")");
		
		System.out.println("---------------------------------");
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 +1;
		System.out.println(b.toBinaryString(v4)+"(십진수: " +v4+")");
		System.out.println("--------------------------------------");
		System.out.println(b.toBinaryString(v5)+"(십진수: " +v5+")");
		System.out.println("--------------------------------------");
		System.out.println(b.toBinaryString(v6)+"(십진수: " +v6+")");
				

	}
	 public String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);//static method, 객체생성x하고 사용
			// 숫자를 넣으면 문자가 return됨(2진수)
		System.out.println(str); //1010
		System.out.println(str.length()); //4
		
		while(str.length()<32) {//3~31
			str="0" +str; 		//01010 -> 001010 ->0001010...00000000000000000000000000001010
		}
		
		return str;
		
	}

}

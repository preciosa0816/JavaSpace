package p02.datatype;

public class GarExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65; // 65<->A 무사히 형전환 가능(char: 2byte)
		char c3 = '\u0041'; // Hex = 유니코드
		char c4 = '가'; 
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);


	}

}

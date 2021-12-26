package p04.two;

public class CharOperationExample {

	public static void main(String[] args) {
		
		String st = ""; //빈문자열 
		char c =' '; // 공백없이 성립안됨
		byte b1=10;
		byte b2=20;
		
		byte b3=(byte) (b1+b2); //int+int로 바꾼후 연산이 이루어짐 , error
		int b4 = b1+b2; // 
		System.out.println(b3);
		
		
		char c1 = 'A'+1; //'A'와 1중 큰 타입인 1에 맞춤, 'A' ->65 : 연산시 큰타입 또는 int로 변경
		
		char c2 = 'A';
		//char c3=c2+1; // 컴파일에러
		char c3=(char) (c2+1); //강제형변환
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+c3);

	}

}

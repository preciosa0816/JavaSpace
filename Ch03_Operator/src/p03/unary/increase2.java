package p03.unary;

public class increase2 {	
	
	//전역변수(field), 클래스 안에 존재, 초기화 필요없음
	int a; //0, 초기화 안됨
	double d; //0.0
	static int b=10;
	char c; //'\u0000'
	String s; //null : unknown(알 수 없는 어떤 값, 0x, 공백x)
	
	public static void main(String[] args) {
		// 로컬변수(local 변수): 메소드 안에 설정, 반드시 초기화를 해야한다.
		int x = 10;
		int y = 10;
		int z=0; //초기화 된것  
		int k;  //초기화 안됨, 초기화=기본 값을 하나 넣으라는 것임. 주로 0 넣기, 출력x
		System.out.println(z);
		//System.out.println(k); //error
		
	}

}

package p01.basic;

public class Practice {

	public static void main(String[] args) {

		String a1 = new String("홍길동");
		String a2 = new String("홍길동");
		
		String a3 = "홍길동";
		String a4 = "홍길동";
		
		// 글자'동' 뽑아내기
		char a =a1.charAt(2);
		System.out.println(a);
		
		
		
		Practice.abc2();
		
		Practice q = new Practice(); //객체생성
		System.out.println(q.a);
		
		q.abc();
		q.abc2();
		
		String A = String.valueOf(q.a);
		System.out.println(A);
		System.out.println(A+3);
		
		
		System.out.println(Byte.MIN_VALUE);
		

	}
	void abc() {
		System.out.println("abc");
	}
	static void abc2() {
		System.out.println("abc2");
		
	}
	int a =10;
}

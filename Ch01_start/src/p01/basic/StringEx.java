package p01.basic;

public class StringEx { //내가 만든 클래스
	
	
	
	public static void main(String[] args) {
		
		String str1 = new String("홍길동"); 	//String은 이미 만들어진 Class., 참조차입 -참조형변수 : 주소값
		String str2 = new String("홍길동"); 	// 이렇게 쓰면 비효율적
		//생성된 string class에 홍길동이 들어있다.
		
		String str3 = "홍길동"; 	//생성됨
		String str4 = "홍길동"; 	//이경우 str4는 생성x 메모리비효율적, str3의 값을 공유함
		
		//=> 객체(str)는 총 3개 생성됨
		
		
		str1.charAt(0);
		System.out.println(str1.charAt(0));
		
		
		StringEx s = new StringEx(); //객체생성(지역변수같은거 부를수있음)
		System.out.println(s.a); //대문자로썼으므로 System은 클래스임 
		
		
		// System.out.println(s.abc()); -> error , syso가 중복되기 때문
		s.abc();
		
		String st = String.valueOf(s.a); //static이기 때문에, 숫자 =>문자 변환
													//같은 클래스가 아니라 불러온 메소드.
													//전혀다른 메소드이기 때문에 String.을 붙인것임
		
		System.out.println(st+5); //st만 넣으면 10이 나와서 분간이 힘듬, st+5는 ='10'+'5' 가됨		
		StringEx.abc2(); //일반적으로 출력시 씀- Static 메소드
					abc2(); //같은 클래스인 경우 + Static 메소드
		
	}
	
	void abc() {
		System.out.println("abc");
		
	}
	static void abc2() {
		System.out.println("abc2");
		
	}
	int a =10; //기본형변수 : 10(실제값)
	//참조타입 - 참조형변수 : 주소값
}

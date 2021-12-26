package p10.static_member;

public class InitialBlock {
	
	//1.변수
	// 2. 생성자
	
	public InitialBlock() {//기본생성자
		
		System.out.println("기본생성자 :: 객체생성시 실행");
	}
	// 3. 메소드
	// 4. 초기화블록
	{
		
		System.out.println("인스턴스 초기화 블록::객체생성시 가장먼저 실행");
	}
	
	static {
		System.out.println("static 초기화 블록 ::프로그램 실행시 가장먼저 최초 한 번 실행");
	}
	
}

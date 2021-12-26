package p02.datatype;

public class BooleanExample {
	
	static boolean stop2 ;
			 boolean stop3 ; 
	
	public static void main(String[] args) {
		
		BooleanExample b = new BooleanExample();
		//참조타입 					클래스타입
		boolean stop = true;
		
		System.out.println(stop2);
		System.out.println(b.stop3);
		// 출력하기 1) static 쓰기
		// 			 2) 클래스를 통째로 복사해서 객체생성하기
		
		//false값이 기본값임
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}

	}

}

package p04.Sync2_no;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		User1 u1 = new User1();			//User1 스레드 생성
		u1.setC(c);								//공유 객체 설정 
		u1.start();								//User1 스레드 시작
		
		User2 u2 = new User2();			//User2 스레드 생성
		u2.setC(c);								//공유 객체 설정
		u2.start();								//User1 스레드 시작
		//User1이 먼저 100을 먼저 저장하고 2초간 일시정지상태가 된 동안에 User2스레드가 momory값을 변경시킴
	}

}

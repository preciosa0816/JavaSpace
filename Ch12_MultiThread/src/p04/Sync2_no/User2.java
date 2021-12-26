package p04.Sync2_no;

public class User2 extends Thread {
	
	private Calculator c;
	

	public void setC(Calculator c) {
		this.setName("User2"); //스레드 이름을 User1으로 저장
		this.c = c;					//공유 객체인 Calculator c를 필드에 저장
		
	}
	
	@Override
	public void run() {
		c.setMemory(50); //공유 객체인 Calculator의 메모리에 100을 저장
	}

	
	
}


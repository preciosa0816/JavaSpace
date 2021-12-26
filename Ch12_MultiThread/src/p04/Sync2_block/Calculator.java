package p04.Sync2_block;
//공유영역 사용방법 : 동기화 블록, 동기화 메소드
public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	//동기화 블록 방법(synchronized) : 한 스레드가 메소드 사용하고 있으면, 다른 스레드는 대기상태
													//두 스레드가 공동으로 사용하고 있는 클래스에만 지정
	public void setMemory(int memory) { 
		synchronized (this) {
			this.memory = memory;

			try {
				Thread.sleep(2000); // 스레드 2초간 일시정지
			} catch (InterruptedException e) { // 현재스레드의 이름과 momory출력
				System.out.println("Error");
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
		
	}

}

package p04.Sync2_no;
//공유영역
public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) { //계산기에 메모리 값을 저장하는 메소드
		this.memory = memory;				//매개값을 memory 필드에 저장
		
		
		try {
			Thread.sleep(2000);			//스레드 2초간 일시정지
		} catch (InterruptedException e) {	//현재스레드의 이름과 momory출력
			System.out.println("Error");
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.memory);
	}

}

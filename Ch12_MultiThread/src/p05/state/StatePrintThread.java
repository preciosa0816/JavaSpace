package p05.state;

public class StatePrintThread extends Thread {
	private Thread t;
 
	public StatePrintThread(Thread t) { // t=상태를 조사할 스레드
		super();
		this.t = t;
	}

	@Override
	public void run() {
		while (true) {

			Thread.State s = t.getState(); // 6가지의 상태중 어떤 상태인지 나타내기
			System.out.println("타겟 스레드 상태 : " + s);
			if (s == Thread.State.NEW) //객체 생성 상태일 경우 실행대기상태로 만듦
				t.start();
			
			if (s == Thread.State.TERMINATED) //종료상태일 경우 while문을 종료함
				break;
			
			
			try {
				//0.5초간 일시정지
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}

	}

}

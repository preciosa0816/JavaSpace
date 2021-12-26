package p06.state_control.wait_notify;
//methodA 실행하는 스레드
public class ThreadA extends Thread {
	
	private WorkObject work;

	public ThreadA(WorkObject work) {
		this.work=work;//공유 객체를 매개값으로 받아 필드에 저장
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) //methodA를 10번 반복 호출
			work.methodA();
	}
}

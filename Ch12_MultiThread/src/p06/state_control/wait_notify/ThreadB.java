package p06.state_control.wait_notify;
//methodB 실행하는 스레드
public class ThreadB extends Thread {
	private WorkObject work;

	public ThreadB(WorkObject work) {
		this.work=work;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++)
			work.methodB();
	}
}

package p06.state_control;

public class ThreadB extends Thread {
	boolean stop;
	boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work)
				System.out.println("ThreadB 작업 내용");
			else
				Thread.yield();//실행상태->대기상태
				
		}
		System.out.println("ThreadB 종료");
	}
}

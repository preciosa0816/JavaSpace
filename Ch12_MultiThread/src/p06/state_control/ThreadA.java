package p06.state_control;

public class ThreadA extends Thread {
	boolean stop; //종료플래그
	boolean work=true; //작업진행여부 플래그
	
	@Override
	public void run() {
		while(!stop) {
			if(work)
				System.out.println("ThreadA 작업 내용");
			else
				Thread.yield();//실행상태->대기상태
				
		}
		System.out.println("ThreadA 종료");
	}
}

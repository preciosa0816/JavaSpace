package p08.thread_group;
//스레드 그룹의 일괄 interrupt()
public class workThread extends Thread {
	
	
	 //스레드 그룹과 스레드 이름 설정
	public workThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup,threadName);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				//InterruptedException이 발생할 때 while문을 빠져나와 종료시킴
			} catch (InterruptedException e) {
				System.out.println(getName()+" interrupted");
				break;
			}
		}
		System.out.println(getName() + "종료됨");
	}
	
}

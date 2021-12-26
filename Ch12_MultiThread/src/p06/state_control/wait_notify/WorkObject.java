package p06.state_control.wait_notify;
//두 스레드의 작업 내용을 동기화 메소드로 작성한 공유객체
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업실행");
		
		notify(); //일시정지상태에 있는 ThreadB를 실행대기상태로 만듦
		
		try {
			wait();//ThreadA를 일시정지상태로 만듦
		} catch (InterruptedException e) {
			
		}
		
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadA의 methodB() 작업실행");
		
		notify(); //일시정지상태에 있는 ThreadA를 실행대기상태로 만듦
		
		try {
			wait();//ThreadB를 일시정지상태로 만듦
		} catch (InterruptedException e) {
			
		}
		
	}
	

	
}

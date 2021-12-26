package p06.state_control.wait_notify;

public class PrintThread extends Thread {
	
	SharedArea s; //객체생성을 안했기 때문에 PrintThread와 SharedArea 둘다 메모리에 있을때만 생성가능
	
	@Override
	public void run() {
	//	System.out.println(s.result);
		while(s.isReady!=true) { //true 가 아니면 3초간 시간지연둠
			
			try {
				synchronized (s) {//wait를 함부로 다른 스레드가 가져다쓰지 못하게 하는 목적
					
					s.wait();//notify로부터 통지받으면 실행
				}
				
				//Thread.sleep(3000); //시간지연 필요없음. wait()가 notify에게 신호받으면 실행
			} catch (InterruptedException e) {
				
			}break; //이것을 쓰지 않으면 false일때 밑의 값이 출력이 되지 않음.
		}
		
		
		System.out.println(s.result);
		
	}
}

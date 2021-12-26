package p06.state_control;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb= new ThreadB();
		
		ta.start();
		tb.start();
		
		try {
			Thread.sleep(3000); //3초간 시간지연
		} catch (InterruptedException e) {
			
		}
		
		ta.work=false; //ThreadA 대기상태 :ThreadB만 실행
		
		try {
			Thread.sleep(3000); //3초간 시간지연
		} catch (InterruptedException e) {
			
		}
		
		tb.work=true;//ThreadA 재개
		
		try {
			Thread.sleep(3000); //3초간 시간지연
		} catch (InterruptedException e) {
			
		}
		
		ta.stop=true;//모두 종료
		tb.stop=true;//모두 종료
	}

}

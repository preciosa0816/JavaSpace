package p19.study.q10;

public class ThreadExample {
//메인스레드가 종료하면 movieThread도 같이 종료하게 만들기 - daemon이용
	public static void main(String[] args) {
		Thread th = new MovieThread();
		
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("종료");
	}

}

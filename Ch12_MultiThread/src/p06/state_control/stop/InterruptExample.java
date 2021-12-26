package p06.state_control.stop;
//1초후 출력스레드를 중지시킴
public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		thread.interrupt(); //스레드를 종료시키기 위해 interruptedException을 발생시킴
	}

}

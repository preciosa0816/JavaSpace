package p06.state_control.stop;
//무한 반복해서 출력하는 스레드
public class PrintThread2_modify extends Thread {

	@Override
	public void run() {

		try {
			while (true) {
				System.out.println("실행중");

				Thread.sleep(1); //interruptedException발생
			}
		} catch (InterruptedException e) {

		}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}

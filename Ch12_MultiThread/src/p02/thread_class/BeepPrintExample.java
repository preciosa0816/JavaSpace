package p02.thread_class;
//메인스레드만 이용한 경우
import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) { //쓰레드는 메인쓰레드 1개임. 
		Toolkit t = Toolkit.getDefaultToolkit(); //싱글톤과 비슷한 개념
		for(int i=0;i<5;i++) {
			t.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("띵"); //0.5초씩 지연후 출력됨
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}

	}

}

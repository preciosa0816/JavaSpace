package p06.state_control;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit t = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			t.beep();
			System.out.println("a");
			try {
				Thread.sleep(3000);// 3초동안 메인 스레드를 일시정지 상태를 만듦
			} catch (InterruptedException e) {
				
			}
			
		}

	}

}

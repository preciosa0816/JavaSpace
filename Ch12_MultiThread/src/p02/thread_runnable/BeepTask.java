package p02.thread_runnable;
//비프음을 들려주는 작업 정의
import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit t = Toolkit.getDefaultToolkit(); //싱글톤과 비슷한 개념// toolkit을 객체구현하는 효과
		for(int i=0;i<5;i++) {
			t.beep();	//toolkit안의 beep을 쓰기위해서 위에서 toolkit을 불렀
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}

	}

}

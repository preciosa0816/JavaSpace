package p20.study.sync;
//계좌잔액합계출력
public class PrintThread extends Thread {
SharedArea sharedArea;

public PrintThread(SharedArea area) {
	sharedArea=area;
	
}
@Override
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {
			
			sharedArea.print(sharedArea);
			
			
			try {
				Thread.sleep(1); //2 스레드간의 실행시간을 맞추기 위해서 
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

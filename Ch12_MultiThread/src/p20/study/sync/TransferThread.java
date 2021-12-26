package p20.study.sync;



//계좌이체수행클래스
public class TransferThread extends Thread {
	SharedArea sharedArea;

	public TransferThread(SharedArea area) {
		sharedArea = area;
	}
	
	@Override
	public void run() {
		for(int cnt=0; cnt<12; cnt++) {
			sharedArea.transfer(10000000);
			//계좌이체 실행하는 메소드
		}
	}
}

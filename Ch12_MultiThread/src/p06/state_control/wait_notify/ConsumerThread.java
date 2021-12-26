package p06.state_control.wait_notify;

public class ConsumerThread extends Thread {
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox=dataBox; //공유 객체를 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String data = dataBox.getData();//새로운 데이터를 읽음
		}
	}

}

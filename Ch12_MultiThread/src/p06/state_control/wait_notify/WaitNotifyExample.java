package p06.state_control.wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharObject = new WorkObject(); //공유객체 생성
		
		ThreadA a = new ThreadA(sharObject);
		ThreadB b = new ThreadB(sharObject);
		
		a.start();
		b.start();

	}

}

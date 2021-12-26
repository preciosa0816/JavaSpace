package p07.daemon_thread;
//1초 주기로 save()메소드를 호출하는 데몬 스레드
//Daemon Thread : 메인스레드가 종료되면 자신도 종료되는 스레드(보조스레드)
public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업내용 저장");
	}

	@Override
	public void run() {
		while (true) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	
	}
}

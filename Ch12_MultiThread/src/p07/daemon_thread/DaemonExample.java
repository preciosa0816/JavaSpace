package p07.daemon_thread;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread a = new AutoSaveThread();

		a.setDaemon(true); // 일반적으로 false가 들어간다면 일단 메소드는 실행하되 적용은 x
							// false : 시작, true : 시작&적용
		a.start();
		
		//메인스레드는 3초후 종료하는 것임
		try {
			Thread.sleep(3000); //메인스레드가 3초후에 종료되면 daemon 도 같이 종료
		} catch (InterruptedException e) {

		}
		System.out.println("Main thread Done");

	}

}

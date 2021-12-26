package p08.thread_group;

public class ThraedGroupExample {

	public static void main(String[] args) {
		
		//myGroup에 두 스레드를 포함시키기
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		workThread workThreadA = new workThread(myGroup, "workThreadA");
		workThread workThreadB = new workThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			}
		
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt()메소드 호출]");
		myGroup.interrupt();
		
	}

}

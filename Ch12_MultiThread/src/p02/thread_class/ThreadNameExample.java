package p02.thread_class;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: "+mainThread.getName());
		
		ThreadA threada = new ThreadA();
		System.out.println("작업 스레드 이름: "+threada.getName());
		threada.start();
		
		ThreadB threadb = new ThreadB();
		System.out.println("작업 스레드 이름: "+threadb.getName());
		threadb.start();
		
	}

}

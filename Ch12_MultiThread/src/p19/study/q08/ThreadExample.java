package p19.study.q08;

import p19.study.q02.MovieThread;

public class ThreadExample { //종료를 출력하고 싶다면???

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		thread.interrupt();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("동영상을 종료합니다.");
	}

}

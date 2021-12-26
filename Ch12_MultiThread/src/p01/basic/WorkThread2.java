package p01.basic;
//3. 작업쓰레드
//쓰레드 생성 : Runnable을 이용한 생성
public class WorkThread2 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				
				Thread.sleep(1000);;//1초는 1000millis , 한번 돌고 1초 정지
			} catch (InterruptedException e) {
				
			} 
		}

	}

}

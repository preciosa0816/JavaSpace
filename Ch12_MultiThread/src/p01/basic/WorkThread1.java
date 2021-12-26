package p01.basic;
//main은 없고 thread는 반드시 상속받아야함
//2. 작업스레드 1
//thread 생성 : thread class 상속을 받아 생성
public class WorkThread1 extends Thread {
	
	//메인의 start()를 실행하면, run()을 찾아서 실행
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			//thread안에 getName()이 존재 :쓰레드 이름을 가져옴
			System.out.println(getName()); 	

			
		}
		
	}
	
}

package p01.basic;

public class MainEx1 {
//1.Main thread : 프로그램의 시작과 스레드 시작
					//하나의 실행 흐름 : thread
	public static void main(String[] args) {
		
		WorkThread1 w1 = new WorkThread1();
		//start()메소드는 run()메소드를 찾아서 실행
		w1.start(); //work thread1 시작
		
		System.out.println();
		
		Runnable r = new WorkThread2();//인터페이스는 불안정해서 start를 바로 시작못함
		Thread w2 = new Thread(r); 
		w2.start(); //work Thread2 시작
		
	}
	
	//

}

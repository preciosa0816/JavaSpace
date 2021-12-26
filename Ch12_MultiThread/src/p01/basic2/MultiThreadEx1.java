package p01.basic2;

public class MultiThreadEx1 {

	public static void main(String[] args) {

		// 1. 작업쓰레드
		Thread t = new DigitThread();
		t.start();
//		<다른 방법>
//		DigitThread d = new DigitThread();
//		d.start();		

		// 출력형식 : ABCD012EF
		// Digit Thread class: 0~9 실행출력
		// Main Thread : A~Z

		// 2.메인쓰레드
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}

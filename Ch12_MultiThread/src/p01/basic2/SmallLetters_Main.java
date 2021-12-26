package p01.basic2;

public class SmallLetters_Main {

	public static void main(String[] args) {//쓰레드3개
		// 작업쓰레드1
		// Runnable r = new SmallLetters();

		Thread t = new Thread(new SmallLetters());
		t.start();

		// 메인쓰레드
		char[] arr = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ' };
		for (char c : arr) {
			System.out.print(c);
		}
		
		//작업쓰레드2
		// 익명구현객체
		Runnable ru = new Runnable() {

			@Override
			public void run() {
				for (char ch = 'a'; ch < 'z'; ch++)
					System.out.print(ch);

			}
		};
		Thread th = new Thread(ru);
		th.start();
	}

}

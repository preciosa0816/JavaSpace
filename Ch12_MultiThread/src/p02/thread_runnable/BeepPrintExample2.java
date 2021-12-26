package p02.thread_runnable;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// 1. 작업쓰레드1(BeepTak)실행

		BeepTask bt1 = new BeepTask();
		Thread th1 = new Thread(bt1);
		th1.start();

		// 2. 작업쓰레드2 : 다형성
		Runnable r1 = new BeepTask();
		Thread th2 = new Thread(r1);
		th2.start();

		// 3. 작업 쓰레드 3 : 익명구현객체 이용해서 쓰레드 실행

		Runnable rn = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("띵2");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}

			}
		};
		// start를 쓰지 못하므로 Thread 생성해주기
		Thread th3 = new Thread(rn);
		th3.start();

		// 4. 작업쓰레드4 : 익명클래스를 이용

		Thread th4 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("띵4");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}

			}
		});
		th4.start();

		//5. Ramda Expression(람다식)을 이용해서 쓰레드 실행  //580P
		//		파라미터 안에 있는 익명구현객체(new Runnable())를 간소화하기 위해서("->")사용
		// 		조건 : @FunctionalInterface 가 붙어있는 것만 가능(API 참조)
					//익명구현객체를 간단하게 표현한 것.(개발기간 단축목적, Java 8 이후)
		Thread th5 = new Thread(() -> { //run을 생략해버림 
			for (int i = 0; i < 5; i++) {
				System.out.println("익명클래스_띵5");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
			}

		});
		th5.start(); //RUN을 찾아 가게되어있음

		// 메인쓰레드
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}

}

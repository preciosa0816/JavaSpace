package p07.study.Ex5;

public class Anonymous {
Vehicle field = new Vehicle() {//익명구현객체
	
	@Override
	public void run() {
		System.out.println("자전거가 달립니다.");
		
	}
};	
	void method1() {//메소드 안 익명구현객체
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
				
			}
		};	
		localVar.run();	
	}
	void method2(Vehicle v) {
		v.run();
	}

}

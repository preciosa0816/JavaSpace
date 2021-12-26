package p06.state_control.wait_notify;

public class MultiThreadEx1 {

	public static void main(String[] args) {
		CalcThread t1 = new CalcThread();
		PrintThread t2 = new PrintThread();
		SharedArea sa = new SharedArea();
		
		t1.s=sa; //calcThread는 생성된 객체의 주소를 가짐(SharedArea 공유)
		t2.s=sa;//calcThread는 생성된 객체의 주소를 가짐(SharedArea 공유)
		
		t1.start(); //syso가 없어서 출력x
		t2.start(); //
		
	}

}

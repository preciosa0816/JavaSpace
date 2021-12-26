package p06.state_control.wait_notify;

public class CalcThread extends Thread {
	SharedArea s;

	@Override
	public void run() {// 원주율 계산 쓰레드
		double total = 0.0;
		for (int i = 1; i < 1000000000; i += 2)
			if (i / 2 % 2 == 0)
				total += 1.0 / i;
			else
				total -= 1.0 / i;

		s.result = total * 4; // 계산결과를 공유영역에 저장
		s.isReady = true;
		
			
		synchronized (s) { //공유영역을 같이 쓰는 스레드에게만 허용
			s.notify(); //wait에게 통지(신호 보내기) : 일다끝나면 wait하고 있는 스레드 한개 한테만 통지함.
		}
		
		
		
		

	}
}

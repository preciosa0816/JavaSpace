package p06.state_control;
//다른 스레드가 종료될 때 까지 일시정지상태 유지
public class JoinExample {

	public static void main(String[] args) {
		
		//작업스레드
		
		SumThread s = new SumThread();
		s.start();
		
		//메인스레드
		try {
			s.join(); //sumThread를 종료할 때 까지(sum을 계산할때까지) 메인 스레드를 일시 정지시킴
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("1~100 합 : "+s.getSum());// join메소드가 없으면 0이 출력됨(더한값출력될때까지 대기필요)
	}

}

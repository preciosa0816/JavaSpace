package p04.Sync;

public class PrintThread extends Thread {
	
	SharedArea s; //객체생성을 안했기 때문에 PrintThread와 SharedArea 둘다 메모리에 있을때만 생성가능
	
	@Override
	public void run() {
		System.out.println(s.result);
		while(s.isReady!=true) { //true 가 아니면 3초간 시간지연둠
			
			try {
				Thread.sleep(3000); //원주율을 계산할 수 있는 시간
			} catch (InterruptedException e) {
				
			}break; //이것을 쓰지 않으면 false일때 밑의 값이 출력이 되지 않음.
		}
		
		
		System.out.println(s.result);
		
	}
}

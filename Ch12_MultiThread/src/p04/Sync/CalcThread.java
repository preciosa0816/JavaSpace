package p04.Sync;

public class CalcThread extends Thread {
	SharedArea s;
	
	@Override
	public void run() {// 원주율 계산 쓰레드
		double total = 0.0;
		for(int i=1;i<1000000000;i+=2)  
			if(i/2%2==0)
				total+=1.0/i;
			else
				total-=1.0/i;
			
			s.result = total*4; //계산결과를 공유영역에 저장			
			s.isReady=true;
		
				
		
	}
}

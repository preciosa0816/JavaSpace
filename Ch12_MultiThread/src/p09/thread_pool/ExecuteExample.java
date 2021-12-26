package p09.thread_pool;
//스레드 풀(ExecutroService) : 갑작스런 병렬작업의 폭증으로 인한 스레드의 폭증을 막음
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

	public static void main(String[] args) throws InterruptedException {
		//최대 스레드 개수가 2인 스레드풀 생성
		ExecutorService exe = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<10;i++) {//작업정의
			Runnable run = new Runnable() { //run()은 리턴값 x , call()은 리턴값o
				
				@Override
				public void run() {
					//스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor ex = (ThreadPoolExecutor) exe;
					
					int poolSize = ex.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " +poolSize+"] 작업 스레드 이름 "+threadName );
					
					//예외 발생 시킴 : NumberFormatException
					int value = Integer.parseInt("삼");
					
					
				}
			};
			//작업 처리 요청(ExecutorSerivce에 Runnable/callable 객체를 넣는 행위
			exe.execute(run); 
			//exe.submit(run); //예외 발생하더라도 스레드 종료x 1,2계속 반복됨
			
			
			//execute():작업처리결과 받기x, 작업처리도중 예외발생시 스레드 종료 및 해당스레드 제거
			//submit():작업 처리 결과를 받을 수 있도록 Future리턴, 에외발생시 종료x 다음작업을 위해 재사용
							//스레드의 생성오버헤더를 줄이기 위해 submit()사용하는 것이 좋다.
						
			Thread.sleep(10);//콘솔에 출력 시간을 주기 위해 0.01초 일시정지시킴
		}
		exe.shutdown(); //현재 스레드+작업큐에 대기중인 모든 작업 처리후 스레드풀 종료

	}

}

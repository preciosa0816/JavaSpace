package p09.thread_pool;
//작업 완료순으로 통보
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample  extends Thread{

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		//CompletionService():처리 완료된 작업을 가져옴[ poll(), take()]
		//poll(): 완료된 작업의 Future를 가져옴,완료된 작업이 없다면 즉시 null을 리턴
		//take():완료된 작업의 Future를 가져옴, 완ㄹ된 작업이 없다면 있을때까지 블로킹됨.
		CompletionService<Integer> com = new ExecutorCompletionService<Integer>(exe);

		System.out.println("[작업 처리 요청]");
		for(int i=0;i<3;i++) {
			//submit() : 스레드풀에게 작업 처리 요청
			com.submit(new Callable<Integer>() {
				
				@Override
				public Integer call() throws Exception {
					int sum=0;
					for(int i=1;i<=10;i++) {
						sum+=i;
					}
					return sum;
				}
			});
			
		}
		System.out.println("[처리 완료된 작업 확인]");
		//스레드풀의 스레드에서 실행하도록 함
		exe.submit(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					try {				
						Future<Integer> future = com.take(); //완료된 작업 가져오기
						int value = future.get();
						System.out.println("[처리 결과]"+value);
					} catch (Exception e) {
						break;
					}
				}
				
			}
		});
		
		//3초 후 스레드풀 종료
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			exe.shutdownNow();
		}
	
	}

}

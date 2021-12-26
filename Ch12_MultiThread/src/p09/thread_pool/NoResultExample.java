package p09.thread_pool;
//Future 객체는 작업결과가 아니라 작업이 완료될 떄까지 기다렸다가 최종 결과를 얻는데 사용된다.(지연완료 객체)
//리턴값이 없는 작업의 경우 Runnable객체로 생성하면 된다
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//블로킹방식의 작업완료 통보
public class NoResultExample {
	public static void main(String[] args) {
		
		ExecutorService exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				int sum=0;
				for(int i=0; i<=10; i++) {
					sum+=i;
				}
				System.out.println("[처리 결과]"+sum);
				
			}
		};
		
		//submit():작업 처리 결과를 받을 수 있도록 Future리턴
		//				스레드가 작업처리를 정상적으로 완료했는지(=null리턴)or 예외가 발생했는지 확인
		Future future = exe.submit(run);
		
		try {
			future.get(); // 스레드가 작업을 완료할 때까지 블로킹되었다가 작업을 완료하면 처리결과를 리턴
			System.out.println("[작업 처리 완료]");
		}  catch (Exception e) {
			System.out.println("[실행 예외 발생함]"+e.getMessage());
		}
		exe.shutdown();
	}
}

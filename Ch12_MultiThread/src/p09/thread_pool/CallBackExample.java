package p09.thread_pool;

//콜백(Callback):콜백이란 애플리케이션이 스레드에게 작업처리를 요청한 후 
//						스레드가 작업을 완료하면 특정 메소드를 자동 실행하는 기법
//블로킹 : 작업 처리 요청 후 작업이 완료될때까지 블로킹
//콜백 : 작업처리를 요청한 후 결과를 기다릴 필요없디 다른 기능을 수행
//			->작업처리 완료시 자동적으로 콜백메소드 실행되어 결과를 알수있기 때문

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CallBackExample {
	private ExecutorService exe;

	public CallBackExample() {
		exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

	}
	
	//콜백 메소드를 가진 CompletionHandler 객체 생성
	//<Integer, Void> = <결과타입, 첨부타입>
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {

		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() 실행 :" + exc.toString());
		}

		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행 : " + result);
		}
	};

	public void doWork(final String x, final String y) {
		//ExecutorService는 콜백을 위한 별도 기능 제공x ->Runnable클래스 이 구현가능
		Runnable task = new Runnable() {

			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null); //정상처리 했을 경우 호출
				} catch (NumberFormatException e) {
					callback.failed(e, null); //예외발생시 호출
				}
			}
		};
		//스레드풀에게 작업 처리 요청
		exe.submit(task);
	}

	public void finish() {
		//스레드풀 종료
		exe.shutdown();
	}

	public static void main(String[] args) {
		CallBackExample ex = new CallBackExample();
		ex.doWork("3", "3");
		ex.doWork("3", "삼");
		ex.finish();
	}
}

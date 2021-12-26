package p09.thread_pool;
//리턴값이 있는 작업 완료 통보
import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업 처리 요청]");

		Callable<Integer> task = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 10; i++)
					sum += i;
				return sum;
			}

		};
		Future<Integer> future = exe.submit(task);

		try {
			int sum = future.get();
			System.out.println("[처리 결과] " + sum);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			System.out.println("[실행 예외 발생함]" + e.getMessage());
		}

		exe.shutdown();

	}

}

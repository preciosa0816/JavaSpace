package p09.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업 처리 요청]");
		class Task implements Runnable {
			Result result;

			Task(Result result) { //외부 Result객체를 필드에 저장
				this.result = result;
			}

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++)
					sum += i;

				result.addValue(sum); //Result 객체에 작업결과 저장	
												//task1실행후 result 값이 55가 남아있는 상태에서 task2실행 ->110

			}

		}
		//두가지 작업 처리를 요청
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Future<Result> future1 = exe.submit(task1, result);
		Future<Result> future2 = exe.submit(task2, result);

		try { //두가지 작업 결과를 취합
			result = future1.get();
			result = future2.get();
			System.out.println("[처리 결과] " + result.accumValue);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("[실행 예외 발생함]" + e.getMessage());
		}
		exe.shutdown();

	}
}

class Result { //처리결과를 저장하는 Result클래스
	int accumValue;

	synchronized void addValue(int value) {
		accumValue += value;
	}
}

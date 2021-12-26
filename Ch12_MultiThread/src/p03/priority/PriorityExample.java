package p03.priority;

public class PriorityExample {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread"+i);
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY); //min=1
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);//max=10, normal=5 의 우선순위
			}
			thread.start(); //결과는 Thread10이 우선순위가 제일 높으므로 가장 일찍 작업이 끝난다.
		}

	}

}

package p09.study.ex5;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {//익명구현객체
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
				
			}
		};
		action.work();
	}

}

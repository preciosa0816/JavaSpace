package p05.system;
//프로그램 종료(exit())
public class ExitExample {

	public static void main(String[] args) {
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) { //종료 상태값이 5일경우 프로세스 종료
				if(status !=5) {
					throw new SecurityException();
					//종료상태값이 5가 아니면 보안관리자에서 SecurityException을 발생시키고 예외처리를 한다.
				}
				
			}
			
		});
		
		for(int i=0; i<10; i++) {
			//i값 출력
			System.out.println(i);
			
			try {
				//JVM종료 요청
				System.exit(i); //현재 실행하고 있는 프로세스 강제종료
			} catch (Exception e) {
				
			}
			
		}

	}

}

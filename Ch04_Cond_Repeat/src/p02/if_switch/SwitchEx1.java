package p02.if_switch;

public class SwitchEx1 {
															//args[] 파라미터 변수
	public static void main(String args[]) { //[] 다르게 배열해도 문제 x
												//run configuration - Argument에 호출할 내용을 넣어놓음
		
		//String job="대리";
		String job=args[3];
		int salary = 0;
		
		switch (job) {
		case "사원":
			salary = 2000;
			break;
		case "대리":
			salary = 3000;
			break;
		case "과장":
			salary = 4000;
			break;
		case "부장":
			salary = 5000;
			break;
		
		default:
			salary = 10000;
			break;
			
		}
		System.out.println("당신의 급여는 "+salary+"원 입니다.");
	}

}

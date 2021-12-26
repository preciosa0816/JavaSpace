package p10.static_member;
//만들어진 클래스의 singleton사용하기
//Calendar클래스인 경우 getInstance()가 singleton에 해당
//Calendar class에서 getInstance()를 호출하면, Calendar의 모든 변수, 메소드 사용가능.
import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
//		Calendar c = new Calendar(); //Calendar는 추상클래스이므로 객체생성 불가
		Calendar c = Calendar.getInstance(); //singleton메소드
		int result = c.get(Calendar.YEAR); //저장하면 연산을 할 수 있음
		int result2 = c.get(Calendar.MONTH); //저장하면 연산을 할 수 있음
		int result3 = c.get(Calendar.DATE); //저장하면 연산을 할 수 있음
		System.out.println(result);
		System.out.println(result+"/"+result2+"/"+result3);
		
		//2019/07/17
	}

}

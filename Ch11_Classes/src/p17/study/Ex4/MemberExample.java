package p17.study.Ex4;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member("blue", "이파란"); // 원래 member에는 주소값이 들어있음
		
		System.out.println(member);	//toString을 재정의 해서 출력값 변경하기

	}

}

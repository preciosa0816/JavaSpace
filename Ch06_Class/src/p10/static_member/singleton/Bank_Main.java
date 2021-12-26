package p10.static_member.singleton;
//내가 만든 Singleton
public class Bank_Main {

	public static void main(String[] args) {

		// 기존의 방법
//		Bank b=new Bank("신한은행");
//		System.out.println(b.name);
//		System.out.println(b.getName());

		// new : singleton - 외부접근 불가능
		Bank b2 = Bank.getBank();
		Bank b3 = Bank.getBank();
		System.out.println(b2.name);
		System.out.println(b2.getName());

		if(b2==b3) { //기존방법일때는 다른 객체임
			System.out.println("같은 싱글톤 객체입니다");
		}else {
			System.out.println("다른 싱글톤 객체입니다.");
		} 
	}
	

}

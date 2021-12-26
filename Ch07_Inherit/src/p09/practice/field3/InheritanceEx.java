package p09.practice.field3;

public class InheritanceEx {

	public static void main(String[] args) {

		// 다형성
		Account obj1 = new CheckingAccount("111-22-3333", "임꺽정", 10000, "5555-666-777-888");

		// 연산자(instanceof)를 사용해서 형변환 여부 판별하기
		if (obj1 instanceof CheckingAccount) {//클래스의 형변환 가능여부
			
			//방법 1******************
//			CheckingAccount obj2 = (CheckingAccount) obj1;
//			try {
//				int amount = obj2.pay("5555-666-777-888", 4700);
//				System.out.println("인출액: " + amount);
//				System.out.println("계좌번호: " + obj2.accountNo);
//				System.out.println("계좌주: " + obj2.ownerName);
//				System.out.println("카드번호: " + obj2.cardNo);
//				System.out.println("카드잔고: " + obj2.balance);
//
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//
//			}
//		} else {
//			System.out.println("Cast할 수 없는 타입입니다.");
			
			
		//방법2****************************
		pay((CheckingAccount) obj1);
		
		}
					
		}

	// int amount = 0;
	private static void pay(CheckingAccount obj2) {
		try {
			int amount = obj2.pay("5555-666-777-888", 4700);
			System.out.println("인출액: " + amount);
			System.out.println("계좌번호: " + obj2.accountNo);
			System.out.println("계좌주: " + obj2.ownerName);
			System.out.println("카드번호: " + obj2.cardNo);
			System.out.println("카드잔고: " + obj2.balance);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}

package p09.practice.field2;

public class CheckingAccount extends Account {
	String cardNo;

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);// 슈퍼클래스의 생성자 호출문: 반드시 첫번째 호출문이어야한다.
		this.cardNo = cardNo;// 클래스안에 선언된 필드를 초기화
	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
}

package p09.practice;

public class Account {

	String accountNo; // 계좌번호
	String ownerName; // 예금주이름
	public int balance; // 잔액

	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(int amount) { // 예금
		balance += amount;
		//

	}

	public int withdraw(int amount) throws Exception {// 인출
		if (balance < amount) // 잔액이 요구 금액보다 적으면 Exception발생
			throw new Exception("잔액이 부족합니다.");

		else {
			balance -= amount;
			return balance;
		}

	}
}
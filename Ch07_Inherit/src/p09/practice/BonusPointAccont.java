package p09.practice;

public class BonusPointAccont extends Account {
int bonusPoint;
	//
//	public void BonusPointAccont() {
//		// TODO Auto-generated constructor stub
//	}
	public BonusPointAccont(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint=bonusPoint;
	}

	@Override
	public void deposit(int amount) {//예금한다 기능을 다시 구현하는 메소드
		balance+=amount;
		super.deposit(amount); //SuperClass의 deposit()을 호출하여 계산
		bonusPoint+=(int)(amount*0.001);
	}
}

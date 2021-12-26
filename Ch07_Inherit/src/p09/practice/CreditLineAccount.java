package p09.practice;

public class CreditLineAccount extends Account {

public int CreditLine;

//public void CreditLineAccount() {
//	// TODO Auto-generated constructor stub
//}

public CreditLineAccount(String accountNo, String ownerName, int balance, int CreaditLine) {
	super(accountNo, ownerName, balance);
	this.CreditLine=CreaditLine;
}


//인출한다 기능을 다시 구현하는 메소드
@Override
	public int withdraw(int amount) throws Exception {
		if((balance+CreditLine)<amount)
			throw new Exception("인출이 불가능합니다.");
		else {
			if(CreditLine<amount) {
				super.withdraw(amount-CreditLine);
				CreditLine=0;
			}
			else {
				CreditLine-=amount;
			}
			return balance;
		}
	}

}

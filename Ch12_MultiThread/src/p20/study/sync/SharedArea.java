package p20.study.sync;

//공유영역
public class SharedArea {
	Account ac1 = new Account("1", "이수일", 20000000);
	Account ac2 = new Account("2", "심순애", 10000000);

	private int totalBalance = ac1.balance + ac2.balance;

	public int getBalance() {
		return totalBalance;
	}

	public void setBalance(int totalBalance) {
		synchronized (this) {
			this.totalBalance = totalBalance;

		}

	}
															//withdraw 와 deposit으로 분리해서 만들어보기
	public void transfer(int money) { //이를 Account에 함수넣고 transfer에 돈을 직접 넣어서쓰기
		synchronized (this) {
			//this.totalBalance = totalBalance;
			SharedArea area = new SharedArea();
			area.ac1.balance -= money;
			area.ac2.balance += money;
			System.out.println(ac1.ownerName + " 계좌 : 100만원 인출, " + ac2.ownerName + " 계좌 : 100만원 입금");

		}
	}
	
	public void print(SharedArea area) {
		synchronized (this) {
			System.out.println("계좌 잔액 합계 : "+ totalBalance);

		}
	}
	

}

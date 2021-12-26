package p16.study.example19;

public class Account {
	private int Balance;
	private int MIN_BALANCE=0;
	private int MAX_BALANCE=1000000;
	private int set;
	
	
	public int getBalance() {
		
		
		return Balance;
	}
	public void setBalance(int balance) {
		if(balance<MIN_BALANCE||balance>MAX_BALANCE) {
			//System.out.println("0~1000000사이의 값을 입력해주세요!");
			Balance=this.Balance;
		}else {
			Balance = balance;
		}
		
			
	}
	
	
	//다른분:싱글톤 작성 *********
	
	


}

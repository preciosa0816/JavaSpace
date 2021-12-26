package p09.practice;

public class PolyMain {

	public static void main(String[] args) {
		Account obj1=new Account("111-22-3333", "임꺽정", 10000);
		CheckingAccount obj2= new CheckingAccount("444-55-666","홍길동",20000,"555-666-777-888");
		CreditLineAccount obj3 = new CreditLineAccount("777-22-3333","김선달",3000,2000000);
		BonusPointAccont obj4 = new BonusPointAccont("000-00-00000","김미영",0,0);

		//다양한 타입의 객체를 가지고 같은 메서드 호출**
		
		
		obj1.deposit(0);
		obj2.deposit(0);
		obj3.deposit(0);
		obj4.deposit(0);
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
		
		
		
	}

	
		//다양한 타입의 객체를 한 타입(Account obj)의 파라메터변수로 받는다.
	static void printAccountInfo(Account obj) {
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주 이름 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println();
		
		//**
	}
}

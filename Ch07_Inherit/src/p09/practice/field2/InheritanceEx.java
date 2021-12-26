package p09.practice.field2;
public class InheritanceEx {
	
	public static void main(String[] args) {
//		Account obj1 = new Account("111-22-3333", "임꺽정", 10000);
//		CheckingAccount obj2 = new CheckingAccount("444-55-666", "홍길동", 20000,	"5555-666-777-888");
		
		//다형성
		Account obj1 = new CheckingAccount("111-22-3333", "임꺽정", 10000, "5555-666-777-888");
		
		CheckingAccount obj2 =(CheckingAccount) obj1;
		int amount=0;		
		try { 
			amount = obj2.pay("5555-666-777-888",4700);
			System.out.println("인출액: " + amount);
			System.out.println("계좌번호: " + obj1.accountNo);
			System.out.println("계좌주: " + obj1.ownerName);
			System.out.println("카드번호: " + obj2.cardNo);
			System.out.println("카드잔고: " + obj1.balance);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		
		}
		
	}
}

package p06.proj.nested_class;

public class PiggyBank_Main {

	public static void main(String[] args) {
		PiggyBank p1 = new PiggyBank();
		PiggyBank p2 = new PiggyBank();
		
		//저장내용바꾸기
		PiggyBank.Slot temp = p1.slot;
		p1.slot=p2.slot;
		p2.slot=temp;
		p1.slot.put(10000);
		p2.slot.put(10);
		
		System.out.println("첫번째 저금통: " +p1.total);
		p2.slot.put(10);
		System.out.println("두번째 저금통: "+p2.total);
		
	}

}

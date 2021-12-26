package p06.proj.nested_class;

public class PiggyBank_Main2 {

	public static void main(String[] args) {
		PiggyBank p1 = new PiggyBank();
		PiggyBank p2 = new PiggyBank();
		PiggyBank p3 = new PiggyBank();
	
		System.out.println("첫번째 저금통: " +p1.total);
		p2.slot.put(100);
		System.out.println("두번째 저금통: "+p2.total);
		System.out.println("첫번째 저금통: " +p3.total);
	}

}

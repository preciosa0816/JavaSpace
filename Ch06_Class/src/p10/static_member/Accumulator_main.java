package p10.static_member;

public class Accumulator_main {

	public static void main(String[] args) {
		Accumulator a1 = new Accumulator();
		Accumulator a2 = new Accumulator();
		a1.accumulate(10);
		a2.accumulate(20);
		System.out.println(a1.total);//10
		System.out.println(a2.total);//20
		System.out.println(Accumulator.grandTotal);
		System.out.println(a2.grandTotal);// 30 스태틱이여서 비효율적
		int result = Accumulator.getGrandTotal(); //***********중요
		System.out.println(result);
		
	}

}

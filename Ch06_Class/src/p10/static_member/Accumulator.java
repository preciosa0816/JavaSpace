package p10.static_member;

public class Accumulator { //static 불가.
	int total ;//stack 영역
	static int grandTotal =0; //Method영역 : 공유영역
	
	void accumulate(int amount) {//인스턴스 메소드는 :인스턴트변수. static변수 모두 사용 가능)
		total = total+amount; //10,20 초기화가됨
		grandTotal +=amount;//10,20  값이 누적됨
		
	}
	static int getGrandTotal() {//
		Accumulator a1 = new Accumulator();
		a1.total=10;
		
		return grandTotal;
	}
	
//	//중첩 클래스는 static 가능
//	static class a{
//		
//	}
}

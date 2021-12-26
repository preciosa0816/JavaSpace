package p02.basic2;

public class DemoMain {

	public static void main(String[] args) {
		//1. 구현된 클래스 객체생성
		Demoimpl demoi= new Demoimpl();
		System.out.println("1. 구현된 클래스 객체생성");
		demoi.print();
		
		//2. 익명구현객체
		Demo da = new Demo() {
			
			@Override
			public void print() {
				System.out.println("annoymous interface :: Overriding");
				
			}
		};
		
		System.out.println("2. 익명구현객체");
		da.print();
			
		
		//3. polymorphism
		System.out.println("3. 다형성");
		Demo d3 = new Demoimpl(); //부모타입|자식타입(작은타입) : 자동형변환(promotion)
		d3.print();
//		d3.write(); (x) //부모에게 자식만 갖고있는것은 안보임
		((Demoimpl) d3).write(); //(o)
		
		System.out.println("====강제형변환후====");
		Demoimpl di= (Demoimpl) d3; //작은타입|큰타입 : 강제형변환(Casting)
		di.print();
		di.write();
	
	}

}

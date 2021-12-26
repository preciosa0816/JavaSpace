package p05.polymorphism.casting_instanceof;

public class VehicleExampleMain {

	public static void main(String[] args) {
		//1.구현된 클래스
		//Bus b = new Bus();
		
		//2. polymorphism(다형성)
			
			//방법1
			Vehicle v = new Bus();
			v.run();
			((Bus) v).checkFare(); //casting
			
			// 방법2
			Vehicle v2 = new Bus();			
			Bus b = (Bus) v2;
			b.checkFare();
			
		
		
		//3. anonymous(익명구현개체)
		//Vehicle v2 = new Vehicle() {
			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
	}

}

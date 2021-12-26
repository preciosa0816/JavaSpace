package p09.instance;

public class CarExample {

	public static void main(String[] args) {
		Car c1=new Car("포르쉐");
		System.out.println(c1.model);
		
		Car c2=new Car("벤츠");
		System.out.println(c2.model);
		
		c1.run();
		c2.run();
		

	}

}

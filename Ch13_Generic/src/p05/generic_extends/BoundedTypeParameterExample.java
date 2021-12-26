package p05.generic_extends;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); //String은 Number타입이 아님
		
		int result1 = Util.compare(10, 20); 
		System.out.println(result1);//-1(10<20)
		
		int result2 = Util.compare(4.5,3); 
		System.out.println(result2);//1 (4.5>3)
		
		int result3 = Util.compare(3,3); 
		System.out.println(result3);//0 (3=3)
	}

}

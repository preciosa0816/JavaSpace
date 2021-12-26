package p04.generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
	//	Box<Integer> b = Util.boxing(100);		//밑의 식과 같음
		
		Box<Integer> b = Util.<Integer>boxing(100);		
		int intvalue = b.getT();
		System.out.println(intvalue);
		
		Box<String> b2 = Util.boxing("홍길동");
		String strValue = b2.getT();
		System.out.println(strValue);
		
	}

}

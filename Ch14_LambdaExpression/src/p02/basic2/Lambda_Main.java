package p02.basic2;

public class Lambda_Main {

	public static void main(String[] args) {
		FunctionalInterE fe;
		FunctionalInterR fr;

		// 1.익명구현객체

//		fe = new FunctionalInterE() {			
//			@Override
//			public void method(int x, int y) {
//				System.out.println("sum : "+(x + y));				
//			}
//		};
//		fe.method(10, 30);
//		
		// 2. 람다식
		fe = (x, y) -> System.out.println("sum : " + (x + y));
		fe.method(10, 30);

		fr = new FunctionalInterR() {

			@Override
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
		};

		int result = fr.method(20, 30);
		System.out.println("Sum2 :" + result);

		// 리턴값이 있는 람다식1
		fr = (x, y) -> {
			int result3 = x + y;
			return result3;
		};

		int result2 = fr.method(2, 3);
		System.out.println("Sum3 :" + result2);

		// 리턴값이 있는 람다식2
		fr = (x, y) -> {
			return x + y;
		};

		int result4 = fr.method(2, 3);
		System.out.println("Sum4 :" + result4);

		// 리턴값이 있는 람다식3
		fr = (x, y) -> x + y;
			
		int result5 = fr.method(2, 3);
		System.out.println("Sum5 :" + result5);
			
		// 리턴값이 있는 람다식4
		fr = (x, y) -> sum(x,y);//밑에 있는 메소드 사용
		int result6 = fr.method(2, 3);
		System.out.println("Sum6 :" + result6);
		
		
	}
	
	public static int sum(int x , int y) {
		return x+y;
	}

}

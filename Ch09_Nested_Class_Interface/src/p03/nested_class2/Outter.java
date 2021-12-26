package p03.nested_class2;

public class Outter {
	
	//Java 7 이전  final이 반드시 붙어있다
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg=100; // 불가,arg는 final이기 때문
//		localVariable=100;
		
		//local inner class : 변수(parameter, local)는 반드시 final로 인식
									//그러므로 값 변경 불가
		
		class Inner{
			public void method() {
				int result = arg+localVariable;
				System.out.println(result);
			}
		}
	Inner in = new Inner(); //객체생성을 해야 inner를 사용할 수 있음
	in.method();
	}
	//Java 8 이후 : final 생략
	public void method2(int arg) {
		int localVariable = 1; //final이기 떄문에 값을 바꿀 수 없다.
//		arg=100; 
//		localVariable=100;
		
		class Inner{
			public void method() {
				int result = arg+localVariable;
				System.out.println(result);
			}
		}
		Inner in = new Inner();
		in.method();
	}
	
}

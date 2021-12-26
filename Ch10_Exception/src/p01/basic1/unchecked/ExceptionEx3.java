package p01.basic1.unchecked;

public class ExceptionEx3 {

	public static void a() throws ArithmeticException{
		b();
	}
	//예외전가 : throws 절~~ //3
	public static void b() throws ArithmeticException{
		int num = 3 / 0;//2
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		a();//1
		
		 System.out.println("Done");
	}
}

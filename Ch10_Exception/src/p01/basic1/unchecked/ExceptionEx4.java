package p01.basic1.unchecked;

public class ExceptionEx4 {

	public static void a(){
		b();
	}
	//예외전가 : throws 절~~
	public static void b(){
		int num = 3 / 0;
	}
//																	2 :JVM에 예외전가
	public static void main(String[] args) throws Exception{
		System.out.println("프로그램 시작");

		a();//1 :2번으로 전가
		
		 System.out.println("Done");
	}
}

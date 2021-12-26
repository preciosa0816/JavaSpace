package p12.wrapper;

public class WrapperEx2 {

	public static void main(String[] args) {
		PrintDouble(123.45);//기본형->참조형(Boxing)
		PrintDouble(new Double(123.45));
		
		
	}
	//123.45->Double ;  boxing
	static void PrintDouble(double d) { //자동 boxing
		System.out.println(d);
		
		
		
	}

}

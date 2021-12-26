package p06.method_reference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
//매개변수의 메소드 참조
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		
//		function= new ToIntBiFunction<String, String>() {		
//			@Override
//			public int applyAsInt(String a, String b) {				
//				return a.compareToIgnoreCase(b);
//			}
//		};
		
		//compareToIgnoreCase : 대소문자 상관없이 문자열 비교

		function= ( a, b)-> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
		
		
		
	}
	public static void print(int order) {
		if(order<0) {System.out.println("사전순으로 먼저 옵니다.");}
		else if(order==0) {System.out.println("동일한 문자열입니다.");}
		else {System.out.println("사전순으로 나중에 옵니다.");}
	}
}

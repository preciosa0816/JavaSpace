package p04.two;

public class StringConcatExample {
				//concat =접합
	public static void main(String[] args) {
		// String은 왼->오 진행
		String str1 = "JDK"+8.0; //문자열+double = 문자열로 바뀜(결합연산자,문자열이 앞에 있을 때)
		 								  // "JDK"+"8.0" = "JDK8.0"
		String str12 = "JDK"+8.0+501; //결합연산자
		
		String str2 = 501+8.0+"JDK"; //501+8.0 = 509.0으로 연산후(산술연산자) 합쳐짐
		
		System.out.println(str1);
		
		System.out.println(str12);
		
		System.out.println(str2);
	}

}

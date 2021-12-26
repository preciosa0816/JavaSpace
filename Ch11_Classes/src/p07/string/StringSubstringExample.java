package p07.string;

public class StringSubstringExample {
//문자열 추출하기(substring())
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum=ssn.substring(0,6);//0~6까지
		System.out.println(firstNum);
		
		
		String secondNum= ssn.substring(7);//7이후
		System.out.println(secondNum);
	}

}

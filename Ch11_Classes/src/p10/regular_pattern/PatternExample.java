package p10.regular_pattern;

import java.util.regex.Pattern;
//517P
public class PatternExample {

	public static void main(String[] args) {
		//(02|010): 02 or 010
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //정규식
		String data = "010-123-4567";// 검증할 문자열
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		//\w+ : 한개 이상의 알파벳 또는 숫자 
		//\. : .
		//(\.\w+)? : \.\w+이 없거나 한 번 더 올 수 있음.
		regExp="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@navercom";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}

}

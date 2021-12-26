package p08.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		// 구분자(delimiter): 앞데이터 뒤데이터를 구분
		String str = "사과=10|초콜릿=3|샴페인=1";

		// returnDelims: 구분자(=,|)를 토큰으로 본다(true)
		StringTokenizer s = new StringTokenizer(str, "=|", true);

		while (s.hasMoreTokens()) {
			String token = s.nextToken();
			if (token.equals("=")) {
				System.out.print("\t"); //일정간격 띄기(탈출문자TAB키)
			}else if(token.equals("|")){
				System.out.print("\n");//탈출문자 줄바꾸기
			}else
			System.out.print(token);

		}
		System.out.println();
		System.out.println("=================");
		//split():배열에 저장하게 만듦
		
		String source = "aaa,bbb,ccc";
		System.out.println(source);
		String source2[]= source.split(",");
		
//		for(int i=0; i<source2.length; i++) {
//			System.out.println(source2[i]);
//		}
		
		System.out.println("==향상된 for문===");
		for(String ss:source2) { //향상된 for문
			System.out.println(ss);
		}
		
		
	}

}

package p17.study.Ex9;
// 나중에 다시해보기
public class StringBuilderExample {
//stringbuilder를 사용한 효율적인 코드 만들기
	public static void main(String[] args) {
		String str=""; //변수열을 string 으로 만들면 연산시 문자열로 변환시킴
		for(int i=0;i<=100;i++) {
			str+=i; 
		}
		
		System.out.println(str);
		
		// 개선코드 작성위치 
		
		StringBuilder sb = new StringBuilder();
		sb.append(""); //문자열을 끝에 추가, 숫자를 문자열로 바꿈
		StringBuilder result=null;
		for(int i=0;i<=100;i++) {
			result =sb.append(i);
			
		}
		
		System.out.println(result);
	}

}

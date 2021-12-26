package p17.study.Ex12;

public class StringConvertExample {
//문자열 "200"을 정수로 변환하는 코드와 숫자 150을 문자열로 변환하는 코드 작성
	public static void main(String[] args) {
		String strData1="200"; //문자열 정수변환
		int intData1=Integer.parseInt(strData1);
		System.out.println(intData1+100); //300 으로 연산이 됨
		
		
		int intData2=150; //정수형 문자변환
		String strData2=String.valueOf(intData2);
		System.out.println(strData2+100); //150100 연산 불가
	}

}

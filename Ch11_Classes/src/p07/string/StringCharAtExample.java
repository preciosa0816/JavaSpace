package p07.string;

import java.util.Scanner;

//주민등록번호에서 남자와 여자 구분하기
public class StringCharAtExample {

	public static void main(String[] args) {
		byte[] bytes = new byte[100];
		System.out.println("주민번호를 입력해주세요 (ex)010624-1230123");
		System.out.print("입력>");
		Scanner sc = new Scanner(System.in);
		
		String ssn = sc.next();
		
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		
		}

	}

}

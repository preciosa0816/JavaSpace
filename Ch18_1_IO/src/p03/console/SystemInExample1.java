package p03.console;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample1 {

	public static void main(String[] args) throws IOException {
		System.out.println("==Menu==");
		System.out.println("1.예금 조회");
		System.out.println("2.예금 출금");
		System.out.println("3.예금 입금");
		System.out.println("4.종료 하기");
		System.out.print("메뉴를 선택하세요 : ");
		
		
		InputStream in =System.in; //in:static 변수
		char ch =(char) in.read(); //int->char
		switch (ch) {
		case '1':
			System.out.println("예금 조회");
			break;
		case '2':
			System.out.println("예금 출금");
			break;
		case '3':
			System.out.println("예금 입금");
			break;
		case '4':
			System.out.println("종료");
			break;

		default:
			break;
		}
	}

}

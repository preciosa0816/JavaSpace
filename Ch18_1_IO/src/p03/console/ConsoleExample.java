package p03.console;

import java.io.Console;

public class ConsoleExample {
//이클립스는 null리턴, 명령프롬프트에서 실행하기 
	//Console클래스는 문자열은 읽을 수 있지만 기본타입(정수, 실수)값을 바로 읽기 불가능
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("비밀번호: ");
		char[] charPass=console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("--------------------------");
		System.out.println(id);
		System.out.println(strPassword);

	}
	
	//명령프롬프트 실행 결과***bin에 주목
//	C:\JavaSpace\Ch18_1_IO\bin>java p03.console.ConsoleExample
//	아이디: wuvluv123
//	비밀번호:
//	--------------------------
//	wuvluv123
//	12345


}

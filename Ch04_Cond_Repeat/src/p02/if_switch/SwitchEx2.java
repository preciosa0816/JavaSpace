package p02.if_switch;

public class SwitchEx2 {
//사과 : Apple, apple =>한번에 받아서 사용하기
//배 : Pear, pear =>

	public static void main(String[] args) {
		char ch = 'a';
		
		switch (ch) {
		case 'a':
		case 'A':
			System.out.println("사과");
			break;
		case 'p':
		case 'P':
			System.out.println("배");
			break;
	
		default:
			System.out.println("?");
			break;
		}
		System.out.println("Done");
	}

}

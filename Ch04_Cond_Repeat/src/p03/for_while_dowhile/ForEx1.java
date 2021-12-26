package p03.for_while_dowhile;

public class ForEx1 {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		
		}
		System.out.println("Done");
		System.out.println("------------------------");
		
		for(int i = 0; i<10; ++i) // i++과 ++i같은 값 실행됨
			System.out.println(i);	//{}안써도 한줄실행
		
		System.out.println("Done");
	}
}


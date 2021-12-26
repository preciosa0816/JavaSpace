package p04.two;

public class StringEqualsExample {
	// 모든 클래스의 부모 클래스 : object class - 자연상속을 받아서 사용
	static double PI = 3.14159;
	public static void main(String[] args) {
		//stack 영역 : str, 참조변수 일시적계산값
		//heap 영역 : new string(),생성된 개체들
		// method 영역 : 공유(static변수, 메소드) PI
		
		
		//str1... :참조변수, 주소값 
		String str = new String(); //기본적인 값을 넣어놓지 않겠다, 나중에 넣을 것
		
		
		
		String str1 = new String("홍길동");// 객체성성으로 메모리 사용
		String str2 = new String("홍길동");
		String str3 = ("홍길동"); // 메모리절약가능
		String str4 = ("홍길동");
		
		System.out.println(str1 == str2); //false  , '=='숫자만사용하기(정확하지 않기 떄문)
		System.out.println(str1 == str3); //false :
		System.out.println(str3 == str4); //true: 
		
		System.out.println(str1.equals(str2)); //true , equals()는 객체와 문자 비교시사용
		System.out.println(str1.equals(str3)); //true
		System.out.println(str3.equals(str4)); //true
		
		

	}

}

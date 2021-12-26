package p07.string;
// String : 일반적으로 문자열 표현
// StringBuffer : String + Buffer+동기화기능(프로그램복잡, 속도저하)기능
// StringBuilder : String + Buffer+비동기화기능(프로그램단순, 속도빠름)기능
public class StringEx1 {

	public static void main(String[] args) {
		//기본형 타입
		char c = 'A'; //Wrapper  Class - Character class
		//참조형 타입
		String str1= new String("홍길동");
		String str2= new String("홍길동");//새로운객체생성
		String str3 = "홍길동"; // 새로운 객체 생성
		String str4 = "홍길동"; // 이미만들어진 str3의 값을 참조함(메모리절약)
//		//equals메소드 사용시 위의 4개가 다 같다는 것을 보증함		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));
//		System.out.println(str3.equals(str4));
		
		String s1 = "abcde";
		String s2 = "  Hello  ";
		//s1+test : 메소드 사용해서 결합해보기
		System.out.println(s1+"test");
		System.out.println(s1.concat("test")); //결합메소드
		
		//s1:a=>c로 변경하기
		System.out.println(s1.replace('a', 'c'));
		
		//s1:cd
		 //subString(bI,cI):beginIndex는 포함이고 endIndex는 불포함
		System.out.println(s1.substring(2,4) );
		
		//a.endWith("b"):b가 a안에 있으면 True or False
		System.out.println(s1.endsWith("cde"));
		
		//a.indexOf("b") : b의 index출력
		System.out.println(s1.indexOf('a'));
		
		//a.charAt(b) : index b의 값 출력
		System.out.println(s1.charAt(0));
		
		//s2:뒤에서 부터 l을 찾아 해당하는 index출력	
		System.out.println(s2.lastIndexOf("l")); //3 뒤에서 부터 찾았기 때문
		System.out.println(s2.indexOf("l")); //2 앞에서 부터 찾음
		
		//a.trim() : 양쪽의 공백없애기
		System.out.println(s2.trim());
		
		//String.valueOf(a):문자열로 바꾸기
		int value=100;		
		String st1 =String.valueOf(value);
		String st2 =value+""; //결합연산자로 숫자가 문자로바뀜(큰타입따라가기)
		System.out.println(st1+300);//100300
		System.out.println(st2+300);//100300
		
		//Integer.parseInt(a):문자를 숫자로 바꾸기
		int i1=Integer.parseInt(st1);
		System.out.println(i1+10); //110
	}

}

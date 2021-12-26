package p04.two;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//int charCode = 'A';
		int charCode = 'a';
		//int charCode = 'z';
		
		System.out.println(charCode); //65
		
		
		if (charCode >=65 & charCode <=90)
			System.out.println("대문자이군요");
		
		if (charCode >=97 && charCode <=122)
			System.out.println("소문자이군요");
		
		if (charCode >=48 && charCode <=57)
			System.out.println("0~9이군요");
		
		if (!(charCode<48) && !(charCode>57)) //!(false) && !(true) ->수행x
			System.out.println("0~9이군요");
		
		System.out.println("------------------------------");
		
		int value =6;
		if (value%2 == 0 | value%3 <=0) //전류가 흐르더라도 두가지 모두 검사함
			System.out.println("2또는 3의 배수군요");
		
		if (value%2 == 0 || value%3 <=0) //전류가 둘중하나만 흐르면 인정, 속도가 빠름 
			System.out.println("2또는 3의 배수군요");

	}

}

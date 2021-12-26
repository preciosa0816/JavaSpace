package p02.if_switch;

public class IfEx1 {

	public static void main(String[] args) {
		int num1 =52;
		int num2 =24;
		
		if(num1>num2) {		// 블록{}:여러 내용일 때 사용		//거짓일때 모든 값 수행x												
			System.out.println("num1값이 더 큽니다.");
			System.out.println("num1="+num1);
		}  
		
			System.out.println("Done");
			System.out.println("-------------------------"); //두 경우의 차이 num2=124일때(거짓일 때)
																		
			
			if(num1>num2) //조건문에서 블록({} 생략 : 한줄만해당)
			System.out.println("num1값이 더 큽니다."); //거짓일 때 수행x : if 문장이 참일때 다음 1줄을 수행
			System.out.println("num1="+num1); 		//if문 탈출 후 문장
			System.out.println("Done");					//if문 탈출 후 문장
			System.out.println("-------------------------");
			
			if(num1>num2) 
			System.out.println("num1값이 더 큽니다.");
			else 		
			System.out.println("num1="+num1); 		//else문장에 속함
			System.out.println("Done");					//if문 탈출 후 문장
			
			System.out.println("-------------------------");
			
			if(num1>num2) 
			System.out.println("num1값이 더 큽니다.");
			//System.out.println("num1값이 더 큽니다."); // error 발생, 한줄만 인정하기 때문, 두줄일때 {}넣어야함
			
			else 		
			System.out.println("num1="+num1); 		//else문장에 속함
			System.out.println("Done");					//if문 탈출 후 문장
	}

}
//ctrl+y 실행취소한내용을 다시 취소 (앞으로)02 <-> ctrl+z
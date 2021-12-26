package p03.for_while_dowhile;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		//Scanner, while을 이용해서 작성하기
		int sum =0; //합계
		boolean flag = true;
		
		System.out.println("합계를 구할 숫자를 입력하세요?> (끝내려면 0을 입력하기)");
//		Scanner sc = new Scanner(System.in);
//		int num= sc.nextInt(); //키보드 입력받는 수
		
		while(flag) {
			System.out.println(">>");
			Scanner sc = new Scanner(System.in);
				int num= sc.nextInt();
			
			if(num !=0) {
				sum=num+sum;
				System.out.println("현재 합계:" + sum);
				
			}else {
				flag = false;
				System.out.println("종료합니다");
			}sc.close();
			
		}System.out.println("최종합계: "+sum);
		
		
	}

}

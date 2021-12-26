package p03.for_while_dowhile;

import java.util.Scanner;

public class WhileEx2_teacher {

	public static void main(String[] args) {
		//Scanner, while을 이용해서 작성하기
		int sum =0; //합계
		boolean flag = true;
		int num;
		
		System.out.println("합계를 구할 숫자를 입력하세요?> (끝내려면 0을 입력하기)");
//		Scanner sc = new Scanner(System.in);
//		int num= sc.nextInt(); //키보드 입력받는 수
		
		while(flag) {
			System.out.println(">>");
			Scanner sc = new Scanner(System.in);
				num= sc.nextInt(); //키보드입력
			
			if(num !=0) {
				sum+=num;
				System.out.println("지금까지 누적 합계"+sum);
			}else {
				flag = false; //break 써도 좋음
				
			}sc.close();
			
		}
		

	}

}

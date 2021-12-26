package p03.for_while_dowhile;

import java.util.Scanner;

public class DoWhileEx_teacher {

	public static void main(String[] args) {
		int input = 0; //키보드 입력값
		int ran = 0; //난수값
		
		//난수 만들기(1~100)
		//do~while : 반드시 한번은 수행함
		ran =(int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		do {													
			System.out.println("1~100사이의 정수를 입력하세요");
			input= sc.nextInt(); 
			if(input>ran) {
				System.out.println("더 작은 수로 다시 시도하세요!");
			}else if(input<ran) {
				System.out.println("더 큰 수로 다시 시도하세요!");
				
			}sc.close();
		} while (input!=ran); //()조건이 맞으면 반복
		System.out.println("맞혔습니다."); //조건이 같지 않는 순간 빠져나옴
		
		/*
		 * while (en.hasMoreElements()) { type type = (type) en.nextElement(); 
		 * //조건이 맞지않으면 실행 x
		 * 
		 * 
		 * }
		 */

	}

}

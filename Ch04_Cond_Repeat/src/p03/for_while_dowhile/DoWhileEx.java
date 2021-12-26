package p03.for_while_dowhile;

import java.util.Random;
import java.util.Scanner;

public class DoWhileEx {
//난수 찾기
	public static void main(String[] args) {
		int input = 0; //키보드 입력값
		//int ran = 0; //난수값
		int ran =(int)(Math.random()*100)+1;
		//난수 만들기(1~100)
		//do~while : 반드시 한번은 수행함
		do {													
			System.out.println("1~100사이의 정수를 입력하세요");
			
			Scanner sc = new Scanner(System.in);
			input= sc.nextInt(); 
			if(input>ran) {
				System.out.println("더 작은 수로 다시 시도하세요!");
			}else if(input<ran) {
				System.out.println("더 큰 수로 다시 시도하세요!");
				
			}sc.close();
		} while (input!=ran);
		System.out.println("맞혔습니다.");
		
		/*
		 * while (en.hasMoreElements()) { type type = (type) en.nextElement(); 
		 * //조건이 맞지않으면 실행 x
		 * 
		 * 
		 * }
		 */

	}

}

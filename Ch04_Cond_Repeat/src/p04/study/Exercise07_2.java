package p04.study;

import java.util.Scanner;

public class Exercise07_2 {

	public static void main(String[] args) {
		//
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택>");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.print("예금액>");
				balance += sc.nextInt();
			} else if (input == 2) {
				System.out.print("출금액>");
				balance -= sc.nextInt();
			} else if (input == 3) {
				System.out.print("잔고>");
				System.out.println(balance);
			} else
				run = false;

		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
} 

package p01.basic;

import java.util.Scanner;

public class FlowTest3 {

	public static void main(String[] args) {
		System.out.println("*를 출력할 라인수를 입력하세요");
		//키보드 입력 : System.in
		
		Scanner sc = new Scanner(System.in);
		/*
		 * String str = sc.nextLine(); //30 
		 * int num = Integer.parseInt(str); //
		 */
		
		int num = sc.nextInt(); //위의 주석처리한 것을 간단하게 표기

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close(); //과부화를 막기 위해 닫아줘야함.
	}
}

package test1;

import java.util.Scanner;

public class Ch3_최대공약수와최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력>>");
		int x = sc.nextInt();
		System.out.print("두번째 수 입력>>");
		int y = sc.nextInt();
		int mul=x*y;
		int temp;
		if (x < y) {
			temp = x;
			x = y;
			y = temp;
		}
		while (x > y) {
			int m=x % y;
			if  (m== 0) {				
				break;
			} else {
				x = y;
				y = m;
			}
		}
		System.out.println("최대공약수: "+y);
		System.out.println("최대공배수: "+mul/y);
	}

}

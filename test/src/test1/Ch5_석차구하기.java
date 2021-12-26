package test1;

import java.util.Scanner;

public class Ch5_석차구하기 {

	public static void main(String[] args) {
		int a[]=new int [25]; //25개 대리점별 매출액
		int r[]=new int [25]; //25개 대리점의 매출액 석차
		
		Scanner StdInput = new Scanner(System.in);
		for(int i=0;i<25;i++) {
			System.out.print("매출액 입력>>");
			a[i]=StdInput.nextInt();//매출액 입력
			r[i]=1;//석차초기값 설정
		}
		
		for(int i=0; i<25;i++) {
			for(int j=0; j<25;j++) {
				if(a[i]<a[j]) //매출액이 큰 대리점이 존재하면
					r[i]+=1; //석차를 1만큼 증가시킴
			}
		}
		
		for(int i=0;i<25;i++) {
			System.out.println(a[i]+" : "+r[i]);
		}
	}

}

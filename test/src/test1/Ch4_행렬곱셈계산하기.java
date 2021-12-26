package test1;

public class Ch4_행렬곱셈계산하기 {

	public static void main(String[] args) {
		int a[][]= {{5,7,-3,4},{2,-5,3,6}};
		int b[][]= {{3,0,8},{-5,1,-1},{7,4,4},{2,4,3}};
		int s[][]=new int[2][3];
		
		for(int r=0;r<=1;r++) {//행2개
			for(int c=0;c<=2;c++) {//열3개
				s[r][c]=0;//초기화
				for(int k=0;k<=3;k++) {//(4*2)*(4*3)이므로 각 항당 4번의 곱셈이 필요함
					s[r][c]=s[r][c]+(a[r][k]*b[k][c]);
				}
			}
		}
		for (int z = 0; z < 2; z++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(s[z][k] + "\t");
			}
			System.out.println();
		}
		
	}

}

package test1;

public class Ch4_마름모모양배열채우기 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int n = 0; // 배열에 넣을 값
		int i = 0; // 행
		int j = 0; // 열
		int s = 2; // 시작 변수
		int q=0; //홀수조정변수
		
		for(int r=0;r<=2;r++) {	
			for(int c=s;c<=4-s;c++) {
				n=2*q+1;
				a[r][c]=n;		
				q++;
			}
			s--;
		}

		for(int r=3;r<5;r++) {	
			for(int c=s+2;c<=2-s;c++) {
				n=2*q+1;
				a[r][c]=n;		
				q++;
			}
			s++;
		}
		
		
		for (int r = 0; r < 5; r++) {
			for (int k = 0; k < 5; k++) {
				System.out.print(a[r][k] + "\t");
			}
			System.out.println();
		}
	}

}

package test1;

public class Ch4_모래시계모양배열 {

	public static void main(String[] args) {
		//행우선 : 행번호를 고정하고 같은 행 안에서 열 번호를 변화시키면서 접근
		//열우선 : 열번호를 고정하고 같은 열 안에서 행 번호를 변화시키면서 접근
		int a[][] = new int[5][5];
		int v = 1;
		int m=3;
		
		for(int r=0;r<m;r++) {
			for(int c=r;c<(5-r);c++) {
				a[r][c]=v;
				v++;
			}
		}
		
		for (int r = m; r <=4; r++) {
			for (int c = (4-r); c <=r; c++) {
				a[r][c] = v;
				v++;
			}
		}
		
		for(int r=0;r<5;r++) {
			for(int k=0;k<5;k++) {
				System.out.print(a[r][k]+"\t");				
			}
			System.out.println();
		}
	}

}

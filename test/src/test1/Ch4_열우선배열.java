package test1;

public class Ch4_열우선배열 {

	public static void main(String[] args) {
		//행우선 : 행번호를 고정하고 같은 행 안에서 열 번호를 변화시키면서 접근
		//열우선 : 열번호를 고정하고 같은 열 안에서 행 번호를 변화시키면서 접근
		int[][] a = new int[5][5];
		int v = 0;
		int c = 0;// 열

		do {
			int r = 0;//행 
			do {
				v++;
				a[r][c] = v;
				r++;
			} while (r <= 4);
			c ++;
		} while (c <= 4);
		
		for(int r=0;r<5;r++) {
			for(int k=0;k<5;k++) {
				System.out.print(a[r][k]+"\t");				
			}
			System.out.println();
		}
	}

}

package test1;

public class Ch4_모래시계모양배열2 {

	public static void main(String[] args) {
		//행우선 : 행번호를 고정하고 같은 행 안에서 열 번호를 변화시키면서 접근
		//열우선 : 열번호를 고정하고 같은 열 안에서 행 번호를 변화시키면서 접근
		int a[][] = new int[5][5];
		int v = 1;
		int r = 0;// 행
		int c = 0;// 열

		for (r = 0; r < 5; r++) {
			for (c = r; c < 5-r; c++) {
				a[r][c] = v;
				v++;
			}
		}
		
		for (r = 3; r < 5; r++) {
			for (c = (4-r); c <=r; c++) {
				a[r][c] = v;
				v++;
			}
		}
		
		for(r=0;r<5;r++) {
			for(int k=0;k<5;k++) {
				System.out.print(a[r][k]+"\t");				
			}
			System.out.println();
		}
	}

}

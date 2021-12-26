package test1;

public class Ch4_삼각형모양배열채우기 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int v = 1;
		int r = 0;// 행
		int c = 0;// 열
		
//	방법1
		for (r = 0; r < 5; r++) {
			for (c = r; c < 5; c++) {
				a[r][c] = v;
				v++;
			}
		}
		
//	방법2
//		do {
//			c = r;
//			do {
//				a[r][c] = v;
//				v++;
//				c++;
//			} while (c < 5);
//			r++;
//		} while (r < 5);
//
		for (r = 0; r < 5; r++) {
			for (c = 0; c < 5; c++) {
				System.out.print(a[r][c] + "\t");
			}
			System.out.println();
		}
	}
}
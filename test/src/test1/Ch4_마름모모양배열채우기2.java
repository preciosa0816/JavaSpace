package test1;

public class Ch4_마름모모양배열채우기2 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int v = 1;
		int m = 2;
		int cl = m;
		int cr = m;
		for (int r = 0; r <= 4; r++) {
			for (int c = cl; c <= cr; c++) {
				a[r][c] = v;
				v += 2;
			}
			if (r < m) {
				cl--;
				cr++;
			} else {
				cl++;
				cr--;
			}
		}

		for (int r = 0; r < 5; r++) {
			for (int k = 0; k < 5; k++) {
				System.out.print(a[r][k] + "\t");
			}
			System.out.println();
		}
	}

}

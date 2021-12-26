package test1;

public class Ch4_ㄹ배열모양채우기 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int v = 1;
		int d = 1;
		int c1 = 0;
		int c2 = 4;
	
		for (int r = 0; r < 5; r++) {
			for (int c = c1; c != c2 + d; c = c + d) {
				a[r][c] = v;
				v++;
			}
			int temp = c1;
			c1 = c2;
			c2 = temp;
			d = -d;
		}

		for (int r = 0; r < 5; r++) {
			for (int k = 0; k < 5; k++) {
				System.out.print(a[r][k] + "\t");
			}
			System.out.println();
		}

	}

}

package test1;

public class Ch4_마방진배열채우기 {

	public static void main(String[] args) {
		int s[][] = new int[5][5];
		int r = 0;
		int c = 2;
		for (int n = 1; n <= 25; n++) {
			s[r][c] = n;
			int nr = r - 1;
			int nc = c + 1;

			if (nr == -1)
				nr = 4;
			if (nc == 5)
				nc = 0;
			if (s[nr][nc] == 0) {
				r = nr;
				c = nc;
			} else {
				r++;
			}

		}
		for (int z = 0; z < 5; z++) {
			for (int k = 0; k < 5; k++) {
				System.out.print(s[z][k] + "\t");
			}
			System.out.println();
		}
	}

}

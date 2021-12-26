package test1;

public class Ch4_배열회전시키기 {

	public static void main(String[] args) {
		char a[][] = { { 'A', 'B', 'C', 'D', 'E' }, { 'F', 'G', 'H', 'I', 'J' }, { 'K', 'L', 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S', 'T' }, { 'U', 'V', 'W', 'X', 'Y' } };
		char b[][] = new char[5][5];

		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				int n = 4 - r;
				b[c][n] = a[r][c];
			}
		}
		for (int z = 0; z < 5; z++) {
			for (int k = 0; k < 5; k++) {
				System.out.print(b[z][k] + "\t");
			}
			System.out.println();
		}

	}

}

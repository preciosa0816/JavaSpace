package test1;

public class Ch3_Bcd코드_3초과코드_변환 {

	public static void main(String[] args) {
		int b[] = { 0, 1, 1, 1 };// BCD코드
		int e[] = new int[4]; // 3초과비트
		int a[] = { 0, 0, 1, 1 }; // 이진수 3
		int c = 0;
		int s=0;
		for (int i = 3; i >= 0; i--) {
			s = b[i] + a[i] + c;
			if (s > 1) {
				c = 1;
				e[i] = s % 2;
			} else {
				c = 0;
				e[i] = s;
			}
		}
		for (int k = 0; k < 4; k++) {
			System.out.print(e[k]);
		}

	}

}

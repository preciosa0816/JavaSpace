package test1;

public class Ch6_급여계산_지폐매수계산 {
	public static void main(String[] args) {
		int p[] = new int[9]; //단위 화폐의 매수
		int t[] = new int[9];//단위 화폐의 합계
		int c = 532263; 
		int r = c; //잔액을 위한 변수
		int m = 10000;//첫번째 단위
		int sw = 1;

		for (int k = 0; k < 9; k++) {
			p[k] = r / m;
			t[k] = t[k] + p[k];
			r = r - (p[k] * m);
			if (sw == 1) {
				m = m / 2;
				sw = 0;
			} else {
				m = m / 5;
				sw = 1;
			}
		}
		System.out.println("만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
		System.out.println("------------------------------------------------------");

		for (int i = 0; i < 9; i++) {
			System.out.print(p[i] + "\t");
		}
		System.out.println();
	}
}

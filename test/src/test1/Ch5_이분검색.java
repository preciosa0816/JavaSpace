package test1;

public class Ch5_이분검색 {

	public static int BS(int E[], int L, int H, int K) {
		int M;
		for (;;) {
			if (L > H) {
				return -99;
			}
			M = (L + H) / 2;
			if (E[M] > K) {
				H = M - 1;
				continue;
			} else if (E[M] < K) {
				L = M + 1;
				continue;
			} else {//E[M] == K
				return M + 1; // 논리적 관계 잘 따져보기
			}
		}

	}

	public static void main(String[] args) {
		int E[] = { 14, 17, 20, 22, 26, 48, 50, 90, 95, 100 };
		System.out.println(BS(E, 0, 9, 20));
	}

}

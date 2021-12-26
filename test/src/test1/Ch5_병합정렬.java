package test1;

public class Ch5_병합정렬 {

	public static void main(String[] args) {
		int a[] = { 2, 5, 10, 17, 20 }; // 오름차순정렬
		int b[] = { 11, 9, 8, 7 }; // 내림차순 정렬

		int m = a.length;
		int n = b.length;
		int c[] = new int[m + n];
		int ia = 0;
		int ib = n - 1;
		int ic = 0; // 첨자용 변수
		int done = 0; // 한쪽 배열이 먼저 모두 처리된 경우 다른 배열을 처리하기위해 토스하게만드는 변수

		for (;;) {
			if (a[ia] < b[ib]) {// 두배열에서 가장 작은수를 찾아 새 오름차순 배열의 1열에 삽입
				c[ic] = a[ia];
				ia++;
				ic++;
				if (ia > m - 1) { //ia가 배열의 크기보다 커진다면==a배열을 c로 모두 옮긴 것
					if (done == 0) {
						a[m - 1] = 999999; //배열안의 있는 수보다 크게 설정하여 다시 한번 반복문을 돌았을 때 a[ia] < b[ib]을 false로 만듦
						ia = m - 1;
						done = 1; //배열옮기기가 끝남을 선포
					} else
						break;
				}
			} else {
				c[ic] = b[ib];
				ib--;
				ic++;
				if (ib < 0) {//ib가 0보다 작아진다면==b배열을 c로 모두 옮긴 것
					if (done == 0) {
						b[0] = 999999;
						ib = 0;
						done = 1; //배열옮기기가 끝남을 선포
					} else
						break;
				}
			}
		}
		for (int z = 0; z < m + n; z++) {
			System.out.print(c[z] + "\t");
		}
	}

}

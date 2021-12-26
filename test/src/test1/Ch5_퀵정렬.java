package test1;

public class Ch5_퀵정렬 {
	public static void QSORT(int[] e, int l, int r) {
		int temp;
		if (l >= r)
			return;
		int p = e[l]; //pivot은 제일 왼쪽의 열로 정함
		int i = l + 1; //왼쪽 배열
		int j = r;	//오른쪽 배열

		do {
			while (p > e[i] && i < r)
				i++;
			while (p < e[j] && j > l)
				j--;
			if (i >= j) //두 열이 가운데에서 만날 때
				break; 
			temp = e[i]; //e[i]와 e[j]끼리 맞바꾸기
			e[i] = e[j];
			e[j] = temp;
		} while (i <= j);
		temp = e[j]; //pivot과 e[j]바꾸기
		e[j] = e[l];
		e[l] = temp;

		QSORT(e, l, j - 1);
		QSORT(e, j + 1, r);

	}

	public static void main(String[] args) {
		int e[] = { 26, 14, 100, 95, 22, 17, 48, 20, 50, 90 };
		System.out.println("기존 정렬");
		for (int i = 0; i < 10; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.println();
		System.out.println();
		
		QSORT(e, 0, 9);
		System.out.println("퀵 정렬 이후");
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.println();
	}

}

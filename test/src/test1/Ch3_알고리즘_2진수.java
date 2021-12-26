package test1;

public class Ch3_알고리즘_2진수 {

	public static void main(String[] args) {
		int b[] = { 0, 1, 0, 1, 0 };
		int o[] = new int[5];
		int t[] = new int[5];

		int i = 0;

//		System.out.print(b[0]);
//		System.out.print(b[1]);
//		System.out.print(b[2]);
//		System.out.print(b[3]);
//		System.out.print(b[4]);
//		System.out.println();
		do {
			o[i] = 1 - b[i];
			i++;
		} while (i < 5); //
//		System.out.print(o[0]);
//		System.out.print(o[1]);
//		System.out.print(o[2]);
//		System.out.print(o[3]);
//		System.out.print(o[4]);
//		System.out.println();
		i = 4;
		int c = 1;
		do {
			t[i] = 1;// t[4]=1 마지막항에 1값을 넣음.
			if (o[i] == c)
				t[i] = 0;// o[4] 가 1이면 t[4]는 0이됨.
			c = o[i] * c; // o[4]가 0이면 c=0, o[4]가 1이면 c=1;
			i--;
		} while (i >= 0);
		for (int a = 0; a < 5; a++) {
			System.out.print(t[a]);

		}
		System.out.println();

	}

}

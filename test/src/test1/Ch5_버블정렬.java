package test1;

public class Ch5_버블정렬 {

	public static void main(String[] args) {
		int e[] = { 95, 75, 85, 100, 50 };
		int i = 0;
		int temp;

		do {
			int j = 0;
			do {
				if (e[j] > e[j + 1]) {
					temp = e[j];
					e[j] = e[j + 1];
					e[j + 1] = temp;
				}
				j++;
			} while (j < 4 - i);
			i++;
		} while (i < 4);
		
		for(int z=0;z<5;z++) {
			System.out.print(e[z]+" ");
		}
	}

}

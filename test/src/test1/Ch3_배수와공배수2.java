package test1;

public class Ch3_배수와공배수2 {

	public static void main(String[] args) {
		int a[] = { 21, 17, 4, 51, 24, 75, 40, 27, 48, 72 };
		int three = 0;
		int four = 0;
		int both = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				three += 1;
			}
			if (a[i] % 4 == 0) {
				four += 1;
			}
			if (a[i] % 3 == 0 && a[i] % 4 == 0) {
				both += 1;
			}
		}
		System.out.println("3의배수 : " + three);
		System.out.println("4의배수 : " + four);
		System.out.println("3,4의배수 : " + both);

	}

}

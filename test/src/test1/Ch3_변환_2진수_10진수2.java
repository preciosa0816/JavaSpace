package test1;

public class Ch3_변환_2진수_10진수2 {

	public static void main(String[] args) {
		int t[] = { 1, 1, 1, 1, 0, 0, 0 }; // 2진수
		int d = 0;
		int f = 0;
		int m = 0;
		if (t[0] == 0) {
			for (int i = 0; i < t.length; i++) {
				d += t[i] * (int) Math.pow(2, t.length - i - 1);

			}
			System.out.println(d);
		} else {

			f = (int) Math.pow(2, t.length - 1);
			for (int i = t.length-1; i >0; i--) {
				d += t[i] * (int) Math.pow(2, 6-i);

			}
			m = f - d;
			
		}
		System.out.println(-m);
	}
}

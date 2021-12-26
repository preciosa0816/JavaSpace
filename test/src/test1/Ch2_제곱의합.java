package test1;

public class Ch2_제곱의합 {

	public static void main(String[] args) {
		int f = 1;
		int l = 100;
		int r;
		int finall = 0;
		while (true) {
			r = (f * l) * (f * l);
			finall += r;
			f++;
			l--;
			if (l == 0)
				break;
			/*
			 * System.out.println("r:"+r); System.out.println("finall:"+finall);
			 */
		}
		System.out.println(finall);
		/* System.out.println((10*10+18*18+24*24+28*28+30*30)*2); */
	}

}

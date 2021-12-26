package test1;

public class Ch2_제곱의합2 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int s=0;
		int c=0;
		do {
			a++;
			b=101-a;
			c=a*b;
			c=c*c;
			s+=c;
		}while(a<100);
		System.out.println(s);
	}

}

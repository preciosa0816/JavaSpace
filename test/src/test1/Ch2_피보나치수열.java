package test1;

public class Ch2_피보나치수열 {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int s= a+b;
		int c=0;
		int n=1;
		while(true) {
			c=a+b;
			s+=c;
			a=b;
			b=c;
			n++;
			if(n==5) break;
			
		}
		System.out.println(s);
	}

}

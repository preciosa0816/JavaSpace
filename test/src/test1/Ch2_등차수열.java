package test1;

public class Ch2_등차수열 {

	public static void main(String[] args) {
		int d=6;
		int a=2;
		int s=a;
		int n=1;
		while(true) {
			a=a+d;
			s=s+a;
			n++;
			if(n==5) break;
		}
		System.out.println(s);

	}

}

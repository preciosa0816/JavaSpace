package test1;

public class Ch2_교행자연수수열 {

	public static void main(String[] args) {
		int n=0;
		int s=0;
		while(true) {
			n++;
			s+=n;
			n++;
			s-=n;
			if(n==100)break;
		}
		System.out.println(s);

	}

}

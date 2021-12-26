package test1;

public class Ch2_등비수열 {
	public static void main(String[] args) {
		int r=3;
		int a=2;
		int s=a;
		int n=1;
//		for(int i=1;i<100;i++) {
//			a=a*r;
//			s=s+a;		
//		}
//		System.out.println(s);
		while(true) {
			a=a*r;
			s=s+a;
			n++;
			if(n==4) break;			
		}
		System.out.println(s);
	}
}

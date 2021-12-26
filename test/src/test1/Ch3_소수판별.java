package test1;
public class Ch3_소수판별 {

	public static void main(String[] args) {
		int p=2;
		int n=3;
		
		while(true) {
			int m= (int) Math.sqrt(n);
		for(int i=2;i<=m;i++) {
			int r=n%i;
			if(r==0)break;
			if(i==m) p=n;
		}
			n++;
			if(n>50) break;
		}
System.out.println(p);
	}

}

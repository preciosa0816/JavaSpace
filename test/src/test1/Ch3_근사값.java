package test1;

public class Ch3_근사값 {

	public static void main(String[] args) {
		int a[]= {10,20,39,37,28,50,78,17};
		int min=533;
		int n = 0;
		int ans=0;
		int check=0;
		do {
			if(a[n]>=33) check=a[n]-33;
			else check=33-a[n];
			
			if(check<min) {
				min=check;
				ans=n;
			}
			n++;
		}while(n<a.length);
		System.out.println(ans+1);
	}

}

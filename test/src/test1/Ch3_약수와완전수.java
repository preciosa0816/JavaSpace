package test1;

public class Ch3_약수와완전수 {

	public static void main(String[] args) {
		int count=0;
		
		for(int n=4;n<=500;n++) {
			int sum=0;
			int k= (int)n/2;
			for(int j=1;j<=k;j++) {
				if(n%j==0) sum+=j;	
			}
			if(n==sum) {
				System.out.println("n : "+n);
				count+=1;
			}
			
		}
		System.out.println(count);
	}

}

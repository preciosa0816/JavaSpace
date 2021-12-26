package test1;

public class Ch2_교행분수수열 {

	public static void main(String[] args) {
		int k = 1;
		double sum = 0;
		int sw=1;

		while(true) {
			if(sw==1) {
				sum+=(double)k/((k+1)*(k+2));
				
			}
			if(sw==-1) {
				sum-=(double)k/((k+1)*(k+2));
				
			}
			k++;
			sw=-sw;
			if(k==50)break;

		}
		System.out.println(sum);

	}

}

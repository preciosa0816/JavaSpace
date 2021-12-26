package test1;

public class Ch2_교행분수수열2 {

	public static void main(String[] args) {
		int k = 0;
		double sum = 0;
		int sw=0;
		double L=0;
		do {
			k++;
			L=(double)k/((k+1)*(k+2));
			if(sw==0) {
				sum+=L;
				sw=1;
			}
			else {
				sum-=L;
				sw=0;
			}
			
		}while(k!=49);
		System.out.println(sum);
	}

}

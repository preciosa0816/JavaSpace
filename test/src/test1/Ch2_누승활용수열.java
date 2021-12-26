package test1;

public class Ch2_누승활용수열 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		int p=0;
		while(true) {
			p++;
			i*=p;
			sum+=i;		
			if(p==4)break;
		}
		System.out.println(sum);

		
	}

}

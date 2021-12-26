package test1;

public class Ch3_배수와공배수 {

	public static void main(String[] args) {
		int a[]= {21,17,4,51,24,75,40,27,48,72};

		int both=0;
		int i=0;
		do {
			int n3=a[i]%3;
			int n4=a[i]%4;
			int n=n3+n4;
			if(n==0) both+=1;
			i++;
		}while(i<10);
		System.out.println("3,4의배수 : "+both);

	}

}

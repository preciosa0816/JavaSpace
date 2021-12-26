package test1;

public class Ch3_변환_10진수_16진수 {

	public static void main(String[] args) {
		int t[]=new int[20];
		int d=1017;
		int i=0;
		int m,n;
		
		do {
			m=d/8;
			n=d%8; //n=d-(m*8)
			t[i]= n;
			i++;
			d=m;
		}while(m>=8);
		
		t[i]= m;
		//int k=i;
		do {
			System.out.print(t[i]);
			i--;
		}while(i>=0);
	}

}

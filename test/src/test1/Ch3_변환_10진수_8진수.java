package test1;

public class Ch3_변환_10진수_8진수 {

	public static void main(String[] args) {
		char h[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char t[]=new char[20];
		int d=1017;
		int i=0;
		int m,n;
		
		do {
			m=d/16;
			n=d%16; //n=d-(m*16)
			t[i]=h[n];
			i++;
			d=m;
		}while(m>=16);
		
		t[i]=h[m];
		//int k=i;
		do {
			System.out.print(t[i]);
			i--;
		}while(i>=0);
	}

}

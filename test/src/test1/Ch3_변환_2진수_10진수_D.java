package test1;

public class Ch3_변환_2진수_10진수_D {

	public static void main(String[] args) {
		int t[]= {1,1,1,1,0,1,1,0}; //2진수
		int c[]=new int[8]; //1의 보수를 저장할 임시 배열 변수
		int d=0;	//10진수로 변환될 값을 보관하는 변수
		int sign=1;
		
		if(t[0]!=0) {
			sign=-1;
			int b=1;
			for(int k=7;k>=1;k--) {
				c[k]=t[k]-b;
				if(t[k]!=0||b!=1) b=0;
				c[k]=Math.abs(c[k]);
				t[k]=1-c[k];
			}
		}
		for(int k=1;k<=7;k++) {
			int t1=(int)Math.pow(2, 7-(double)k);
			int t2=t[k]*t1;
			d+=t2;
		}
			d*=sign;
			System.out.println(d);
	}

}

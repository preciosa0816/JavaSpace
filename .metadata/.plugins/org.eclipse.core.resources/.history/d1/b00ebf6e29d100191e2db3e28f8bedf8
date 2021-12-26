package test1;

public class Ch4_달팽이모양배열채우기 {

	public static void main(String[] args) {
		int a[][]=new int [5][5];
		int n=0; //배열에 넣을 값
		int s=1; //행열 증감용 변수
		int i=0; //행
		int j=-1; //열
		int k=5; 	//	배열에 숫자를 배정하는 수행횟수에 대한 변수
		
		do {
			for(int p=0;p<k;p++) {
				n+=1;
				j=j+s;
				a[i][j]=n;				
			}
			k--;
			for(int p=0;p<k;p++) {
				n+=1;
				i=i+s;
				
				a[i][j]=n;			
			}
			s=-s;
		}while(k>0);
		
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print(a[i][j]+"\t");				
			}
			System.out.println();
		}
	}

}

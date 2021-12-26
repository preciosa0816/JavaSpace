package test1;

public class Ch5_선택정렬 {

	public static void main(String[] args) {
		//오름차순정렬
		int c[]= {95,75,85,100,50};
		int temp;
		int i=0;
		do {
			int j=i+1;
			do {
				if(c[i]>c[j]) {//c[i]<c[j] 라면 내림차순 정렬
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				j++;
			}while(j<5);
			i++;
		}while(i<4);
		
		for(int k=0;k<5;k++) {
			System.out.print(c[k]+" ");
		}
	}
}

package test1;

public class Ch5_삽입정렬 {

	public static void main(String[] args) {
		int e[]= {95,75,85,100,50};
		int i;
		int j, KEY;
		for(i = 1;i<5;i++) {
			KEY=e[i];
			for(j=i-1;j>=0;j--) {
				if(e[j]<=KEY) break;
				e[j+1]=e[j];
			}
			e[j+1]=KEY;
		}
		
		for(i=0;i<5;i++) 
			System.out.print(e[i]+"\t");
			//System.out.println();
		
	}

}

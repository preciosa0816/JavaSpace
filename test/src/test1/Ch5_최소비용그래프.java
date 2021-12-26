package test1;

public class Ch5_최소비용그래프 {

	public static void main(String[] args) {
		int c[]= {4,2,10,7,12,15,18,20,9,13,1}; //간선의 가중치
		int CYCLE[]= {0,0,0,0,0,1,0}; //6번째 사이클 발생
		int n=7; //정점의 갯수
		int e=11; //간선 갯수
		int temp;
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+"\t");
		}
		for(int i=0;i<e-1;i++) {
			for(int j=i+1;j<e;j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println(n);
		for(int i=0;i<11;i++) {
			System.out.print(c[i]+"\t");
		}
		
		int l=1; //최소비용 그래프에 참여한 간선의 개수
		int k=0; //반복용 변수
		int t=0; //최소비용 그래프에 참여한 간선들의 가중치 총합
		
		while(l<=(n-1)) {
			if(CYCLE[k]==0) {
				t=t+c[k];
				l=l+1;
			}
			k+=1;
		}
		System.out.println("\n가중치 총합 : "+t);
	}

}

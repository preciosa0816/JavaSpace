package test1;

public class Ch3_근사값2 {

	public static void main(String[] args) {
		int a[]= {10,20,39,37,28,50,78,17};
		int min=533;
		int num = 0;
		int check=0;
		for(int i=0;i<a.length;i++) {
			int com=Math.abs(a[i]-33);
			if(min>com) {
				min=com;
				num=a[i];
				check=i;
			}
		}
		System.out.println(num);
		System.out.println("항번호 : "+(check+1));
	}

}

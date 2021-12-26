package test1;

public class Ch3_최댓값과최솟값 {

	public static void main(String[] args) {
		int i=0;
		int max=0;
		int eng[]= {70,60,55,100,85,75,80,100,95,100};
		int math[]= {90,45,60,77,85,65,80,95,80,55};
		while(true) {
			if(eng[i]==100) {
				if(math[i]>max) {
					max=math[i];
				}
				
			}
			i++;
				if(i==10) break;
				
		}
System.out.println(max);
	}

}

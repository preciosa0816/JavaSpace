package test1;

public class Ch3_합계와평균 {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		int day=0;
		double T[]= {184,240,9,235,333,295,20,38,329,34,
							350,59,313,24,187,327,234,59,324,47,
							145,95,282,148,213,182,283,227,156,217};
		
		while(true) {
			 
			if(T[i]>200){
				sum+=T[i];
				day+=1;
			}
			i++;
			if(i==30)break;
		}
		System.out.println(sum);
		System.out.println(day);
		System.out.println(sum/day);
	}

}

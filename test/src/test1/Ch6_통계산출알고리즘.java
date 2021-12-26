package test1;

public class Ch6_통계산출알고리즘 {

	public static void main(String[] args) {
		int student[]=new int [300];
		int sum=0;
		double avg;
		int count=0;
		
		for(int j=0;j<300;j++) {
			student[j]=(int) (Math.random()*120)+1;
		}
		
		for(int i=0;i<student.length;i++) {
			sum+=student[i];
		}
		avg=sum/student.length;
		
		
		for(int i=0;i<student.length;i++) {
			if(student[i]>avg) count++;
		}
		System.out.println(count);
	}

}

package p04.study;

public class Exercise03 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=0 ; i<101;i++) {
			if(i%3==0) {
			sum+=i;
			}
		}System.out.println("3의 배수의 합: "+sum);

	}

}

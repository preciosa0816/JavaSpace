package p03.for_while_dowhile;

public class WhileEx {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		
		while(i<=50) {			
			sum=i+sum; //누적 //for문으로도 만들어보기!
			i++;
			
		}
		System.out.println("1~50합: "+sum+"입니다.");
	}

}

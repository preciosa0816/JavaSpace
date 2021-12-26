package p01.basic;

public class FlowTest1 {

	public static void main(String[] args) {
		// 입력 : 국어:80, 영어:70, 수학 : 90
		// 총점:
		// 과락 : 40점
		// 평균 :60점이상이면 합격
		
		//입력방법 5가지
		// int kor=70
		// int[] ar={70,80,90}
		// args[0] 에 값 넣기
		// Scanner 통해 넣기 
		// file 
		
		int subject[] = {39,70,90};
		int sum=0;
		
		for (int i=0; i<subject.length; i++) {
			sum=subject[i]+sum;
			
		}
		System.out.println(sum);		
		
		
		
		 if (sum/subject.length>60) {
		    	System.out.println("합격입니다");
		    	for (int i=0; i<subject.length; i++) {
		    		if (subject[i]<40)
		    			System.out.println("과락입니다");
		    		break;	
		    		
		    		}   	
		}else {
		    	System.out.println("불합격입니다");
				
	
		
		}
		
	}	
}
	

	



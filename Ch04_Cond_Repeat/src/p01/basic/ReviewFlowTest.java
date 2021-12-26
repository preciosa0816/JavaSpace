package p01.basic;

public class ReviewFlowTest {

	public static void main(String[] args) {
		// 입력 : 국어:80, 영어:70, 수학 : 90
		// 총점:
		// 과락 : 40점
		// 평균 :60점이상이면 합격

		// 입력방법 5가지
		// int kor=70
		// int[] ar={70,80,90}
		// args[0] 에 값 넣기
		// Scanner 통해 넣기
		// file
		
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int mat = Integer.parseInt(args[2]);
		
		int total = kor+eng+mat;
		
		if (total>180) {
			if (kor<40||eng<40||mat<40) {
				System.out.println("과락입니다.");
			}else {
				System.out.println("합격입니다");
			}
		
		}else {
			System.out.println("불합격입니다.");
		}
		

	}

}

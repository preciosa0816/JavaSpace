package p01.basic;

public class FlowTest2 {

	public static void main(String[] args) {
		// 입력 : 국어:80, 영어:70, 수학 : 90
				// 총점:
				// 과락 : 40점
				// 평균 :60점이상이면 합격
		
		int kor = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int mat = Integer.parseInt(args[2]);
		
		int total = kor+mat+eng;
		if (total>180) {
			if(kor<40||eng<40||mat<40) {
				System.out.println("과락입니다.");
			}else {
				System.out.println("합격입니다.");
			}
		}else {
			System.out.println("불합격입니다");
		}

	}

}

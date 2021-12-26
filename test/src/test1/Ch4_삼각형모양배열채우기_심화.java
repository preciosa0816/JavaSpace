package test1;

public class Ch4_삼각형모양배열채우기_심화 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int v = 1;
		int r = 0;// 행
		int c = 0;// 열
		int k=v;
		
//	사례1 : 제곱근도출
//		for (r = 0; r < 5; r++) {
//			for (c = r; c < 5; c++) {
//				
//				a[r][c] = k;
//				v++;
//				k=(int) Math.pow(v, 2);
//			}
//		}
		
//	사례2 :숫자가 적어지는 배열
//		v=15;
//		for (r = 0; r < 5; r++) {
//			for (c = r; c < 5; c++) {
//				a[r][c] = v;
//				v--;
//			}
//		}
		
//사례3 : 열번호 출력
//		for (r = 0; r < 5; r++) {
//			for (c = r; c < 5; c++) {
//				a[r][c] = c+1;
//			}
//		}
		
//사례4 : 직각삼각형
//		for (r = 0; r < 5; r++) {
//			for (c = r; c < 5; c++) {
//				a[c][r] = v;
//				v++;
//			}
//		}
		
//		사례5 : 홀수값 삼각형 출력
//		int b=1;
//		for (r = 0; r < 5; r++) {
//			for (c = r; c < 5; c++) {				
//				a[r][c] = v;
//				v=2*b+1;
//				b++;
//			}
//		}
		
// 사례6: 음수와 양수를 번갈아 가며 출력하기
//		for (r = 0; r < 5; r++) {
//			for (c = r; c < 5; c++) {
//				a[r][c] = v;
//				v=-v;
//			}
//		}
		
//		사례7 : 짝수값 삼각형 출력
		int b=1;
		for (r = 0; r < 5; r++) {
			for (c = r; c < 5; c++) {			
				v=2*b;
				a[r][c] = v;			
				b++;
			}
		}		
		for (r = 0; r < 5; r++) {
			for (c = 0; c < 5; c++) {
				System.out.print(a[r][c] + "\t");
			}
			System.out.println();
		}
	}
}
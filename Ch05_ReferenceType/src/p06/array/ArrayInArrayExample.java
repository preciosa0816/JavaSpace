package p06.array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int math0[] = new int[2];// 일차원 배열

		int math[][] = new int[2][3];// 2차원 배열, 2행3열 배열생성
		for (int i = 0; i < math.length; i++) {// 2행
			for (int k = 0; k < math[i].length; k++) { // 3열
				System.out.println("math[" + i + "][" + k + "]=" + math[i][k]);
			}
		}
		System.out.println();

		int[][] eng = new int[2][];// 2차원 배열, 2행여러열 배열생성
		eng[0] = new int[2]; // 1행 : 2열
		eng[1] = new int[3]; // 2행 : 3열
		for (int i = 0; i < eng.length; i++) {// 2행
			for (int k = 0; k < eng[i].length; k++) { // 3열
				System.out.println("eng[" + i + "][" + k + "]=" + eng[i][k]);
			}
		}
		System.out.println();

		int[][] java = { { 85, 80 }, { 92, 96, 80 } };// new int[2][]
		// 행은 2개가 맞지만 앞은 2열, 뒤는 3열임
		for (int i = 0; i < java.length; i++) {// 2행
			for (int k = 0; k < java[i].length; k++) { // 3열
				System.out.println("java[" + i + "][" + k + "]=" + java[i][k]);
			}
		}
	}

}

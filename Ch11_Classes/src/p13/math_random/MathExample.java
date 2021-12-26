package p13.math_random;

public class MathExample {

	public static void main(String[] args) {
		// Math.abs() : 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		System.out.println();

		// Math.ceil() : 올림값
		double v3 = Math.ceil(5.3); // 6.0 올림
		double v4 = Math.ceil(-5.8);// -5.0 (- 값이기 때문)
		System.out.println(v3);
		System.out.println(v4);
		System.out.println();

		// Math.floor(): 내림값(버림)
		double v5 = Math.floor(5.3); // 5.0 내림
		double v6 = Math.floor(-5.3);// -6.0
		System.out.println(v5);
		System.out.println(v6);
		System.out.println();

		// Math.round(): 반올림값
		double v7 = Math.round(5.6); // 6.0 반올림
		double v8 = Math.round(-5.6);// -6.0
		System.out.println("v7="+v7);
		System.out.println(v8);
		System.out.println();

		// Math.reandom():랜덤값(0~0.999999999)
		int result = (int) (Math.random() * 6) + 1;
		System.out.println(result);

		// Math.max() : 최대값
		int v9 = Math.max(5, 9);
		double v10 = Math.max(5.3, 2.5);
		System.out.println("v9=" + v9);
		System.out.println("v10=" + v10);
		System.out.println();

		// Math.min() : 최소값
		int v11 = Math.max(5, 9);
		double v12 = Math.max(5.3, 2.5);
		System.out.println("v11=" + v11);
		System.out.println("v12=" + v12);
		System.out.println();

		//Math.rint(): 가까운 정수의 실수값
		double v13=Math.rint(5.3);
		double v14 = Math.rint(5.7);
		System.out.println("v13="+v13);
		System.out.println("v14="+v14);
		System.out.println();
		
		
	}

}

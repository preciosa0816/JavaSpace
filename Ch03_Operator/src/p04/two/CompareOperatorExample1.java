package p04.two;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		
		int v2 =1;
		double v3=1.0d;//1.0=1.0d
		//'==' : 수치 비교시 사용하는 연산자
		// equals():문자열, 객체비교시 사용
		System.out.println(v2==v3); //true
		
		double v4 =0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); //false 
		System.out.println((float) v4==v5); //강제형변환시 true
		System.out.println( v4==(double)v5); //false 
		
		System.out.println(v4*10==v5*10); //true
		System.out.println((int)(v4*10)==(int)(v5*10)); //true

	}

}

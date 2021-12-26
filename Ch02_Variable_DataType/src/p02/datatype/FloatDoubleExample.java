package p02.datatype;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 실수값 저장
		// 실수(Floating Point) : 소숫점 표현방식
		//float : 4byte()
		//double: 8byte()
		double var1 = 3.14;
		double var2 = 3.14F; //Promotion(자동형변환)
		float f1 = (float) var2; //casting(강제형변환)
		
		double var4 = 0.1234567890123456789;
		float var5 = (float) 0.1234567890123456789;
		
		
		
		
		//정밀도 테스트
		
		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		System.out.println("var4: "+var4);
		System.out.println("var5: "+var5);
		
		//e사용하기
		//int var6=3000000;
		double var7=3e6;
		float var8=3e6F;
		double var9 = 3e-6f;
		
		//double var9 = 2e-3;
		//System.out.println("var6: "+var6);
		System.out.println("var7: "+var7);
		System.out.println("var8: "+var8);
		System.out.println("var9: "+var9);
				
		

	}

}

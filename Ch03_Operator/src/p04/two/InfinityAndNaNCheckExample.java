package p04.two;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x =5;
		int s =0; //s=10일때 x/s=0.2 지만 반올림이 안되어 0 출력
		double y= 0.0;
		
		try {
			double z=x/y;//Infinity, y=0일때
					
			System.out.println(z); //Infinity
			System.out.println(Double.isInfinite(z)); //true
			System.out.println(Double.isNaN(z)); 	 //false
			System.out.println(z+2);//Infinity
			
			
		} catch (Exception e1) {
			System.out.println("숫자를 0.0으로 나눌 수 없습니다.");
		}
		System.out.println("종료!");
		
		System.out.println("---------------------------------------");
		//y=3.0;
		try {
			double t = x%y;
			System.out.println(t); //y=0일때 NaN , 3일때 2
			System.out.println(Double.isFinite(t)); //false
			System.out.println(Double.isNaN(t)); //true
		} catch (Exception e1) {
			System.out.println("숫자를 0.0으로 나눈 나머지구하기"); //출력안됨
		}
		System.out.println("---------------------------------------");
		
		
		try {
			int k =x/s; //분모가 0이면 error, 예외발생 //0.0으로 나누면 infinity, 0으로 나누면 error
			System.out.println(k);
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("연산에 overflow 발생 :: 숫자를 0으로 나눌 수 없습니다.");
		}
		System.out.println("Done");
		System.out.println("---------------------------------------");
		
		y=3.0;
		double z= x/y;
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2); //z가 double 이기 때문에 2가 double 타입으로 바뀜
		}
	}

}

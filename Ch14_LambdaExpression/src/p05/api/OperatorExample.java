package p05.api;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	//Operator 함수적 인터페이스 : 매개값ㅇ르 가지고 메소드 안에서 "연산"
	private static int[] scores = { 92, 95, 87 };
	private static int maxOrMin(IntBinaryOperator op) {
		int result =scores[1]; //92 95,98 다 넣어도 결과 변화 x
		for(int score : scores)
			result = op.applyAsInt(result, score); //비교해서 값 넣기
		
		return result;
	}

	
	public static void main(String[] args) {
		//최대값얻기 
		
		
		int max = maxOrMin(
				(a,b)->{
					if(a>=b) return a;
					else return b;
				}
				);
		
		System.out.println("최대값 : "+max);
		
		//최소값얻기 
		int min = maxOrMin(
				(a,b)->{
					if(a>=b) return b;
					else return a;
				}
				);
		
		System.out.println("최소값 : "+min);
		
		
	}

}

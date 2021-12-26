package p08.study.q5;

import java.util.function.IntBinaryOperator;

public class LambdaExample {

	private static int[]scores = {10,50,3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result=scores[0];
		for(int score : scores) {
			result=operator.applyAsInt(result, score);
		}
		return result;
	}
	public static void main(String[] args) {
		//최대값 얻기
		
		//원래의 식
		int m = maxOrMin(new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int a, int b) {
				if(a>=b)return a;
				else return b;
			}
		});
		
		//람다식
		int max= maxOrMin(
				(a,b)->{
					if(a>=b)return a;
					else return b;
				}
				);
				
		System.out.println("최대값: "+max);
		
		int min = maxOrMin((a, b)-> {
				if (a<=b) return a;
				else return b;			
		});
		
		System.out.println("최소값 : "+ min);
		
	}

}

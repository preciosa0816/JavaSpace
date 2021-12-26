package p05.api.and_or_negate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2의 배수 검사
//		IntPredicate predicateA = new IntPredicate() {			
//			@Override
//			public boolean test(int a) {				
//				return a%2==0;
//			}
//		};
		
		//2의 배수 검사
		IntPredicate predicateA = (a)-> a%2==0;
		
		//3의 배수검사
		IntPredicate predicateB = a->a%3==0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and() : 둘다 만족
		predicateAB=predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? "+ result);
		
		//or() : 하나만족
		predicateAB=predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2또는 3의 배수입니까? "+ result);

		//predicateA.negate() :predicateA값이 false가 나오면 true 도출(만족x시 true)
		predicateAB=predicateA.negate(); 
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? "+result);
		//predicateB로는 짝수를 판별할 수 있음
	}
}

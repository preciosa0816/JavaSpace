package p06.method_reference;

import java.util.function.IntBinaryOperator;
//정적메소드와 인스턴스 메소드 참조(외부클래스 메소드 호출)
public class MethodReferenceExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
//		operator= new IntBinaryOperator() {
//			@Override
//			public int applyAsInt(int left, int right) {			
//				return Calculator.staticMethod(left, right);
//			}
//		};
		//정적메소드 참조
		operator= (int left, int right)->Calculator.staticMethod(left, right);
		System.out.println("결과 1: "+operator.applyAsInt(1, 2));
	
		operator = Calculator :: staticMethod;
		System.out.println("결과 2: "+operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		Calculator obj = new Calculator();
		operator=(x,y)->obj.instanceMethod(x, y);
		System.out.println("결과 3: "+operator.applyAsInt(5,6));
		
		operator = obj :: instanceMethod;
		System.out.println("결과 4: "+operator.applyAsInt(7,8));
		
	}

}

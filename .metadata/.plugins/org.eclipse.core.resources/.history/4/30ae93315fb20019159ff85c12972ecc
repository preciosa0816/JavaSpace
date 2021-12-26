package p01.basic;

import java.lang.annotation.Annotation;

//Interface를 사용하는 방법
public class Lambda_Main {
	public static void main(String[] args) {
		// 1. interface를 구현한 클래스
		FuntionallinterImpl f1 = new FuntionallinterImpl();
		f1.method();

		// 2. 다형성(polymorphism)
		FunctionalInter f2 = new FuntionallinterImpl(); //부모가 자식보기
		f2.method();

		// 3. 익명구현객체
		FunctionalInter f3 = new FunctionalInter() {

			@Override
			public void method() {
				System.out.println("익명구현객체 추상 메소드 재정의");

			}
		};
		f3.method();

		// 4. 람다식 : 익명구현객체표현을 더 간소화 한것
		FunctionalInter f4 = ()-> {
				System.out.println("익명구현객체 추상 메소드 재정의");		
		};
		f4.method();
		//4-2 람다식 더욱 간소화
		FunctionalInter f5 = ()-> System.out.println("익명구현객체 추상 메소드 재정의");				
		f5.method();
		
	}

}


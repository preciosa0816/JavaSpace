package p07.polymorphism.array;

//Polymorphism(다형성) : 하나의 부모타입으로 여러 자식객체를 가리킬 수 있는 것.
//					   사용목적 : 중복제거, 재사용성, 통일성, 일관성
//					   전제조건 : 반드시 상속관계
//						큰 타입 = 작은타입 형식으로 사용
// 					  작은 타입 =(작은타입) 큰타입 : 강제형변환

public class ArrayMethod {

	public void sleep() {
		System.out.println("sleep()");
	}
	
	public void showSleepStyle() {
		System.out.println("sleepSleepStyle()");
	}
}

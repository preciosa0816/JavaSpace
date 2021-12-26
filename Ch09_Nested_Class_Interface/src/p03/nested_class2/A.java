package p03.nested_class2;

public class A {
	//인스턴스 필드
	
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
		
	}
	
	//정적 필드 초기화
	// static B field3 = new B(); (x)//static 아니라서 에러
	static C field4=new C();
	
	//정적메소드
	static void mehod2() {
		//B var1 = new B(); (x)//static 아니라서 에러
		C var2 = new C();
		
	}
	
	//인스턴스 멤버 클래스
	class B{}
	
	
	//정적멤버클래스
	static class C{}
}

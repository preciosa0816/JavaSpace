package p11.finals;

public class BB extends B {
	// b=10
	////// int b=10; //새로운 b가됨(부모클래스 b가 아님), 자식이 만든 변수

	// 메소드 재정의

//	@Override
//	void methodB() {//부모클래스에 final이 붙어있으면 재정의 불가
//		System.out.println("Overriding : 자식이 재정의");
//		//super.methodB();
//	}
	void methodBb() {
		System.out.println("자식이 만든 메소드");
		//super.methodB();
	}

}

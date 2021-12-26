package p08.abstract_class;

//추상클래스: 추상메소드가 있는 클래스
//				자동차인 경우 : "미완성 설계도"
//									(일반클래스: 설계도)
//				클래스 앞에 반드시 "abstract"표기
//				강제성, 일관성
//				객체생성 불가 =>자식클래스에서는 가능
// 추상메소드는 자식클래스에서 반드시 재정의해서 사용.
public abstract class MyClass { 
	int num=3;
	
	public MyClass() {
		
	}
	
	void methodA() {
		System.out.println("methodA()");
		
	}
	
	//선언만 있고 몸통이 없음 = 추상메소드->반드시 "abstract"를 표기
	public abstract void methodB();
	
}

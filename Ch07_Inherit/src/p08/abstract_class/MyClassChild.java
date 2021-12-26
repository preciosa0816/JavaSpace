package p08.abstract_class;

public class MyClassChild extends MyClass {
	// 추상클래스의 자식클래스는 추상메소드를 반드시 재정의 
	
	
	@Override
	public void methodB() {
		System.out.println("추상메소드 재정의: 반드시");

	}

}

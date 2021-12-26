package p01.basic;
//Lambda Expression(람다 표현식) : 익명구현객체 표현 : "->"
// 우리가 만든 Interface : 인터페이스 안에 추상메소드가 단 하나인것
// 개발자가 만든 Interface인 경우 : "@FunctionalInterface" 표시가 된것

@FunctionalInterface
public interface FunctionalInter {
	//1. 고정상수
	//2. 추상메소드
	public void method();
	//public void method2(); //Error : 람다식을 만들 인터페이스의 추상메소드는 1개여야함
	
	//3. default메소드
	//4. static 메소드
	
	
}

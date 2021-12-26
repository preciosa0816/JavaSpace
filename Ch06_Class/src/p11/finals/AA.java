package p11.finals;
//AA는 A라는 클래스를 상속받아 만든 클래스 
//자식클래스 : 부모클래스가 가진 모든 변수와 메소드 사용가능 (단,final이 없을 때)
public class AA extends A {

	int aa=10;
	static final int K=20; //상수 : 고정된 숫자 , 관습적으로 대문자쓰기=상수를 뜻함.
	void methodAA() {
		System.out.println(aa);
		
	}
//	@Override //재정의 : 부모 클래스의 메소드중 껍데기놔두고 내용만 바꾸기 
//	void methodA() {
//		System.out.println("Overriding :: 자식이 재정의");
//		super.methodA();
//	}
}

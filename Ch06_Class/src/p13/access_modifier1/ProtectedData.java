package p13.access_modifier1;

//Protected : 클래스 불가, [변수 앞,생성자앞, 메소드 앞] 사용가능
		//부모클래스에서 "protected"를 설정하고 패키지가 다른 자식클래스에서만 사용 가능
//																	같은 패키지안에서는 사용 가능
public class ProtectedData {

	protected ProtectedData() { // 기본생성자

	}

	protected int protectedVar = 50;

	protected void method() {
		System.out.println("출력해보세요");
		return; // 수행하는 것에 의미, 결과값x
	}
}

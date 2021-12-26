package p13.access_modifier2;

import p13.access_modifier1.ProtectedData;

//protected 접근 제한자 : 패키지가 다른 경우에는 반드시 상속관계여야 사용 가능
public class ProtectedDataAccess2 extends ProtectedData {

	public static void main(String[] args) {
		
		//자식클래스 객체생성
		ProtectedDataAccess2 p2=new ProtectedDataAccess2();
		
		System.out.println(p2.protectedVar);
		p2.method();
		

	}

}

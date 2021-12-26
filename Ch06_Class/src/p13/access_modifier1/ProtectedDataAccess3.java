package p13.access_modifier1;

//protected 접근 제한자 : 같은 패키지 내에서는 protected가 붙은 변수, 메소드 사용 가능
public class ProtectedDataAccess3 {

	public static void main(String[] args) {
		ProtectedData p = new ProtectedData();
		System.out.println(p.protectedVar);
		p.method();

	}

}

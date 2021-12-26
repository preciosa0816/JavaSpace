package p01.variable;

public class VariableScopeExample {
//변수 : 블록안에서만 사용해야 한다.
	public static void main(String[] args) {
		int v1 = 15;
		int v2=0; //미리 선언하면 쓸 수 있음
		if(v1>10) {
			v2=v1-10;
			
		}
		int v3=v1+v2+5; //v2변수를 사용할 수 없기 때문에 컴파일 에러가 생김
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);

		
	}
	

}

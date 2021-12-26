package p06.protected_method2;

import p06.protected_method.A;

public class D extends A { //자식패키지의 경우 protected 패키지인 A 사용 가능
	
	public D() {
		super(); // (o)
		this.field = "value"; // (o)
		this.method(); // (o)
	}
}
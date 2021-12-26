package p11.finals;

public class FinalEx {

	public static void main(String[] args) {
		AA a = new AA(); //자식객체만 생성
		
		System.out.println(a.a); //부모클래스 사용가능
		System.out.println(a.aa);
		a.methodA();
		a.methodAA();
		
		BB b = new BB();
		b.b=10;
		System.out.println(b.b);
		b.methodB();
		b.methodBb();
		
		C c = new C();
		System.out.println(c.a);
		c.a=30;
		System.out.println(c.a);
		System.out.println(c.NUM);
		System.out.println(C.NUM2);
//		c.NUM=300; //값 변경불가
//		c.NUM=500;
//		C.NUM2=300;
	}

}

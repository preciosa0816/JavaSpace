package p02.nested_class;

public class A_Main {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		System.out.println();
		
		
		//인스턴스 Inner Class 객체생성
		A.B b= a.new B();
		System.out.println(b.f1);
		b.mothod1();
		System.out.println();
		
		//Static Inner Class 객체생성
		
		A.C c = new A.C();
		System.out.println(c.f1);
		System.out.println(A.C.f2); //static
		c.mothod1();
		A.C.mothod2(); //static
		
		
	}

}

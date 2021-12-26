package p02.nested_class;

//중첩 (Nested) 클래스

//Outter Class(외부클래스)
public class A {
	
	public A() { //생성자와 메소드 존재
		System.out.println("A의 기본생성자");
	}
	
	void method() {
		//1. Local Inner Class : static멤버(변수, 메소드) 사용불가
		class D{ 
			D() {
				System.out.println("D객체가 생성됨");
			}
			int f1;
//			static int f2; 
			void method1(){
				System.out.println("Local Inner Class :: method1()");
			}
//			static void method2(){				
//			}
			
		}
		
		D d = new D();
		d.f1=3;
		System.out.println(d.f1);
		d.method1();
	}
//Inner Class	
	//2. Instance Inner Class(static이 없는 클래스) : static 멤버(변수, 메소드) 사용불가
	class B{
		public B() {
			System.out.println("B객체가 생성됨");
		}
		
		int f1;
//		static int f2;
		void mothod1() {		
			System.out.println("Instance Inner Class :: method1");
		}
//		static void mothod2() {			
//		}
		
	}
	
	//3. static Inner Class : 인스턴스/스태틱 멤버 모두 사용가능
	static class C{
		public C() {
			System.out.println("C객체가 생성됨");
		}
		
		int f1;
		static int f2;
		void mothod1() {			
			System.out.println("Static Inner Class::method1()");
		}
		static void mothod2() {			
			System.out.println("Static Inner Class:: static method2()");
		}
		
	}
	
	//4. Anonymous Class*******중요
	
	
}

/*
 * class F{
 * 
 * }
 */
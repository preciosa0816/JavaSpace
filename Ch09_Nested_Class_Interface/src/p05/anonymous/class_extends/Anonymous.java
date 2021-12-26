package p05.anonymous.class_extends;

public class Anonymous {
	
	//1. 익명클래스 생성
	Person p = new Person() {
		
		void work() {//일반 메소드
			System.out.println("출근하기");
			
		}
		@Override //ctrl+space 누르면 재정의하는거 뜸
		void wake() {
			System.out.println("6시에 일어나기~~");
			work();
		}
		
		
	};
	
	void method1() {
		//익명클래스
		Person p = new Person() {
			void walk() {
				System.out.println("산책하기~~");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어나기");
				walk();
			}
		};
		p.wake();
	}
	
	void method2(Person p) { //파라미터변수이자 로컬변수
		p.wake();
	}
	
	
}

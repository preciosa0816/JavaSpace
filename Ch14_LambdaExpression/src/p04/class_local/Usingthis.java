package p04.class_local;
//람다식에서 바깥객체와 중첩객체의 참조를 얻어 필드값을 출력하는 방법
public class Usingthis {
	
	//람다식 실행 블록에는 클래스의 멤버인 필드와 메소드를 제약 사항 없이 사용가능
	//람다식에서 this는 내부적으로 생성되는 익명객체의 참조가 아니라 람다식을 실행한 객체의 참조
			
	public int outterfield =10;
	class Inner{
		int innerfield = 20;
		
		void method() {
			
			MyfunctionalInterface fi = ()-> {
					System.out.println("outfield: "+ outterfield);
					//바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
					System.out.println("outfield: "+ Usingthis.this.outterfield+"\n");
										
					
					
					System.out.println("innerfield: "+ innerfield);
					//람다식 내부에서 this는 inner객체를 참조
					System.out.println("innerfield: "+ this.innerfield+"\n");
				
			};
			fi.mothod();
		}
	}
	
	
}

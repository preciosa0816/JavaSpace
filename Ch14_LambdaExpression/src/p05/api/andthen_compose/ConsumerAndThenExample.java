package p05.api.andthen_compose;

import java.util.function.Consumer;
import java.util.function.Function;
//Function 안에는 andThen()과 compose() 메소드가 있다.
//andThen():인터페이스 A,B=> 인터페이스A부터 처리후 결과를 인터페이스 B의 매개값으로 제공->B가 최종결과 리턴
//compose():우선 인터페이스B부터 처리하고 결과를 인터페이스 A의 매개값으로 제공->A가 최종결과 리턴
public class ConsumerAndThenExample {

	public static void main(String[] args) {
		Function<Member,	Address> functionA;
		Function<Address,	String> functionB;
		Function<Member,	String> functionAB;
		String city;

//		functionB = new Function<Address, String>() {			
//			@Override
//			public String apply(Address t) {
//				t.getCity()
//				return null;
//			}
//		};
						
		functionA = (m)-> m.getAddress();
		functionB = (a)-> a.getCity();
		
		
		//functionA부터 실행함
		functionAB=functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
	
		System.out.println("거주도시 : "+city);
		
		//functionA부터 실행함
		functionAB = functionB.compose(functionA);
		city=functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		
		System.out.println("거주도시 : "+city);
		
	}
}

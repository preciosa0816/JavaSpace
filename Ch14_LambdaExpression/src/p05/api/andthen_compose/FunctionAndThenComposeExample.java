package p05.api.andthen_compose;

import java.util.function.Consumer;

//andThen():인터페이스 A,B=> 인터페이스A부터 처리후 결과를 인터페이스 B의 매개값으로 제공->B가 최종결과 리턴
//compose():우선 인터페이스B부터 처리하고 결과를 인터페이스 A의 매개값으로 제공->A가 최종결과 리턴
public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
//		Consumer<Member> comsumer = new Consumer<Member>() {			
//			@Override
//			public void accept(Member t) {
//				System.out.println();				
//			}
//		};
		
		Consumer<Member> consumerA = (m)->System.out.println("consumerA:"+m.getName());
			
		Consumer<Member> consumerB = (m)-> 	System.out.println("consumerB: "+m.getId());


		Consumer<Member> consumerAB=consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	}

}

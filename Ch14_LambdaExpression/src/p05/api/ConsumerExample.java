package p05.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// 1.구현객체
		ConsumerImpl c1 = new ConsumerImpl();
		c1.accept(10);

		// 2.익명구현객체
		Consumer<Integer> c2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t * 10);

			}
		};
		c2.accept(20);

		// 3. 람다식	- consumer//integer
		Consumer<Integer> c3 = t -> System.out.println(t * 10);

		c3.accept(20);

		// 3. 람다식2
		Consumer<String> c4 = t -> System.out.println(t + "8");

		c4.accept("java");

		// 4. Biconsumer 익명구현객체
		BiConsumer<String, String> bi1 = new BiConsumer<String, String>() {			
			@Override
			public void accept(String t, String u) {
				System.out.println(t+u);			
			}
		};
		
		bi1.accept("java", "8");
		// 4. 람다식 - Biconsumer //string,string
		BiConsumer<String, String> bi2 = (t, u) -> System.out.println(t + u);
		bi2.accept("java", "8");
		
		// 5. 람다식 - Doubleconsumer //double
		DoubleConsumer d1 = d -> System.out.println("java"+d);
		d1.accept(8.0);
		
		// 5. 람다식 - objintConsumer //string+int
		ObjIntConsumer<String> oc = (t,i) -> System.out.println(t+i);
		oc.accept("java",8);
		
		
		
		
	}

}

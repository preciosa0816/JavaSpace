package p05.api;
//Consumer : 매개값은 있고 리턴 값은 없음
import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Integer> {
	public void accept(Integer t) {
		System.out.println(t+10);
	};
}

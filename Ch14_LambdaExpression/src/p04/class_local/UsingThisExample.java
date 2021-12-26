package p04.class_local;

public class UsingThisExample {

	public static void main(String[] args) {
		Usingthis usingThis = new Usingthis();
		Usingthis.Inner inner = usingThis.new Inner();
		inner.method();

	}

}

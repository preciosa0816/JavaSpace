package p02.generic_type_yes;

public class BoxExample {

	public static void main(String[] args) {
		
		Box<String> b1 = new Box<String>();
		b1.setT("hello");
		System.out.println(b1.getT());
		
		Box<Integer> b2 = new Box<>();
		b2.setT(100);
		System.out.println(b2.getT());
	}

}

package p02.nested_class.book;

public class Outter_Main {

	public static void main(String[] args) {
		Outter ot = new Outter();
		Outter.Nested nested = ot.new Nested();
		nested.print();
		
		
	}

}

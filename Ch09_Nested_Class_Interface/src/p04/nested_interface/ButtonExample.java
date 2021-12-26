package p04.nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button b = new Button();
		
		b.setListener(new CallListener());
		b.touch();
		
		b.setListener(new MessageListener());
		b.touch();
	}

}

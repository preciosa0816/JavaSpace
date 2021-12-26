package p07.polymorphism.array;

public class ArrayMethodA extends ArrayMethod {
	
	@Override
	public void sleep() {
		System.out.println("sleep(): Overriding");
		super.sleep();
	}
	
	@Override
	public void showSleepStyle() {
		System.out.println("showSleepStyle() : Overriding");
		super.showSleepStyle();
	}
}

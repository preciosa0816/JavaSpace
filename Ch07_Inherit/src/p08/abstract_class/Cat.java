package p08.abstract_class;

public class Cat extends Animal {

	public Cat() {
		this.Kind="포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");

	}

}

package p02.runtime;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog) animal; //단독 사용시 ClassCastException 발생가능(cat 때문에)
		System.out.println("dog");
		}else {
			System.out.println("Cat");
		}
			
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
package p10.static_member;

public class Singleton {
	private static Singleton singleton=new Singleton();
	
	private Singleton() {	}
	
	static Singleton getInstance() {
		return singleton;
	}
}

package p05.api.minby_maxby;

public class Fruit {
	Integer price;
	String name;
	
	public Fruit(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
		
	public Integer fruit() {
		return price;
	}
	
}

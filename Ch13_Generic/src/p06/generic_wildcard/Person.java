package p06.generic_wildcard;
//일반인 : 일반(고등학생, 근로자, 일반)
public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return name;
	}
}

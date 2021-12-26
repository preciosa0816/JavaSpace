package p03.set.hashset;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {		
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		Person p = (Person) obj;
		if((this.age==p.age)&&(name.equals(p.name))){
			
			return true;
		}
		else
			return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+age;
	}
	
}

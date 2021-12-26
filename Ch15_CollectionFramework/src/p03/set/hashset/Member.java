package p03.set.hashset;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {

		return (name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return mem.name.equals(name) && mem.age == age;
		} else
			return false;

	}
}

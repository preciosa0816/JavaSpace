package p03.object.clone;

public class Member implements Cloneable{ //복제할 수 있다는 표시
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public Car car; 
	
	public Member(String id, String name, String password, int age, boolean adult, Car car) {
		//super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.car=car;
	}

	public Member getMember() {
		Member cloned = null;
		try { //자기자신을 복제해서 내보내기
			cloned = (Member) clone(); //clone()메소드의 리턴 타입은 Object이므로 Member타입으로 캐스팅해야함
		} catch (CloneNotSupportedException e) {		}
		return cloned;
	}

}

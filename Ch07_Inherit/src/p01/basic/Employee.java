package p01.basic;

public class Employee {
	//
	String name;
	int salary;

	//생성자는 상속대상 x
	public Employee() {

	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	//일반메소드
	public String getEmployee() {

		return name + ":" + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

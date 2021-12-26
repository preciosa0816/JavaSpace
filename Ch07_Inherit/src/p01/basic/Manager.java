package p01.basic;

public class Manager extends Employee {

	// 부모로 부터 상속 받은 내용 : 변수, 메소드
	// 상속제외 : 생성자, private, 초기화블록

	/*
	 * String name; int salaly;
	 * 
	 * public String getEmployee() {
	 * 
	 * return name + ":" + salary; }
	 */

	String depart;

	// 생성자 Overloading
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String depart) {
		super(); // 부모의 기본 생성자호출 : 부모객체생성
		this.depart = depart;
	}

	// 부모클래스에서 변수가져옴
	public Manager(String name, int salary, String depart) {
		//super(); // 부모의 기본 생성자호출 : 부모객체생성 , 첫줄에 작성(Java의 규칙)

		super(name,salary); //부모클래스 메소드 참조
//		this.name;
//		this.salary
		
		this.depart = depart;
//		super(); // 첫줄이 아닐시 Error!
	}

	@Override
	public String toString() {// 주소값이 나오게 설계되어있었음

		return name + " : " + salary;
	}

	@Override
	public String getEmployee() {// 부모객체 Employee 재정의하기
		System.out.println("Employee getEmployee() overridding");
		System.out.println("super : 부모 클래스 호출");
		System.out.println("super():부모의 기본생성자 호출 : 부모객체 생성");
		return super.getEmployee()+" : "+depart;
	}
}

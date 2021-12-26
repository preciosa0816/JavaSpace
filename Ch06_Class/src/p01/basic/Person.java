package p01.basic;

public class Person {
	// field(변수)
	String name; // 홍길동
	int age; // 30
	// 값을 미리 넣어줄 수 있다.(상황에 변화에 둔감하다)

	// Constructor Overloading(기본생성자, 파라미터생성자 등 생성자가 모여있는 것) // override와 구분
	// 기본생성자:파라미터가 있는 생성자상태에서 기본객체를 생성하면 반드시 만들어야한다!
	public Person() {
		name = "홍길동5";
		age = 35;
	}

	public Person(String string, int i) {
		name = string;
		age = i;
	}

	// getter()&setter()
	// getter():클래스 안에 있는 변수값 가져오기
	public String getName() {// 가져오는 메소드()
		return name;
	}

	// setter():클래스 안에 있는 필드(변수)에 값을 저장하기
	public void setName(String name) { // 저장하는 메소드
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//@:어노테이션
//@Override //재정의 : 상속받은 메소드를 자식 클래스가 자기 상황에 맞게 고쳐서 사용하는 것.
//public String toString() {
//	String str="머신러닝과정";
//	return str;
//}
}

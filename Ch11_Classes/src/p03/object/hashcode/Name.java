package p03.object.hashcode;

import p03.object.equals.Circle;

public class Name {
	String firstName;// harry
	String lastName;// potter

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// hashcode() 재정의
	// 1. hashcode() 재정의 하기
	@Override
	public int hashCode() {

		return firstName.hashCode() + lastName.hashCode();
	}

	// 2. equal()
	// 재정의 : 우리가 만든 클래스 비교인 경우 반드시 재정의 해야 " 같은 객체다"라고 확인
	@Override
	public boolean equals(Object obj) { //

		if (!(obj instanceof Name))// 형변환 가능 여부 확인하는 연산자
			return false;
		Name n =  (Name) obj; // Casting
		if (this.firstName == n.firstName && this.lastName==n.lastName) { 
			return true;
		} else
			return false;
	}

}

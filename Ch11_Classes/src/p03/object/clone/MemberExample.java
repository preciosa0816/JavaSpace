package p03.object.clone;

public class MemberExample { //얕은 복제 : 복사본의 참조객체변경시 원본도 같이 변경됨.

	public static void main(String[] args) {
		//원본 객체 생성 										//car은 참조객체
		Member original = new Member("blue", "홍길동","12345",25,true, new Car("그랜져"));
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password="67890"; //복제객체의 패스워드 변경
		
		cloned.car.model="소나타";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+cloned.id);
		System.out.println("name: "+cloned.name);
		System.out.println("password: "+cloned.password);
		System.out.println("age: "+cloned.age);
		System.out.println("adult: "+cloned.adult);
		System.out.println("car: "+cloned.car.model);
		
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: "+original.id);
		System.out.println("name: "+original.name);
		System.out.println("password: "+original.password); //원본 객체의 패스워드는 변함 없음
		System.out.println("age: "+original.age);
		System.out.println("adult: "+original.adult);
		System.out.println("car: "+original.car.model);	//얕은복제로 인해 원본의 참조객체가 변경됨
		
	}

}

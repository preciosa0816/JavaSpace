package p03.object.clone;

public class MemberExample_deep {

	public static void main(String[] args) {
		// 원본 객체 생성
		Member_deep original = new Member_deep("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));

		// 복제 객체를 얻은 후에 참조객체의 값을 변경
		Member_deep cloned = original.getMember();
		cloned.scores[0] = 100;									//깊은 복제 후 참조 객체의 데이터를 변경
		cloned.car.model = "그랜저";								//깊은 복제 후 참조 객체의 데이터를 변경

		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for(int i = 0; i<cloned.scores.length;i++) { //cloned.scores.length=2({90,90}이기 때문)
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":","); //i문장이 참이라면 "", 거짓이면 ","출력
		}

		System.out.println("}");
		System.out.println("car : "+ cloned.car.model);
		System.out.println();

		System.out.println("[원본 객체의 필드값]");

		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for(int i = 0; i<original.scores.length;i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		} 
		System.out.println("}");
		System.out.println("car : "+ original.car.model); //참조객체변경후에도 원본값은 변경 x
	}

}

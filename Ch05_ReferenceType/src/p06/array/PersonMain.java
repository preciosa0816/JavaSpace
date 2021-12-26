package p06.array;

public class PersonMain {

	public static void main(String[] args) {
		Person p[] = new Person[10]; // Person클래스를 10개 순서대로 나열:배열

		// for :
		// age:21,22,23 ...
		// name: 홍길동1, 홍길동2, 홍길동3 ...
		// 결과: 홍길동 n의 나이는 x입니다.

		p[0] = new Person(21, "홍길동1"); // 생성자만들기
		p[1] = new Person(22, "홍길동2");
		p[2] = new Person(23, "홍길동3");
		p[3] = new Person(24, "홍길동4");
		p[4] = new Person(25, "홍길동5");
		p[5] = new Person(26, "홍길동6");
		p[6] = new Person(27, "홍길동7");
		p[7] = new Person(28, "홍길동8");
		p[8] = new Person(29, "홍길동9");
		p[9] = new Person(30, "홍길동10");

		System.out.println(p[0].name + "의 나이는 " + p[0].age + "입니다.");
		System.out.println("---------------------------------");
		// 방법 2

		for (int i = 0; i < p.length; i++) {
			p[i] = new Person(21 + i, "홍길동" + i);// 생성자 만들기

			System.out.println(p[i].name + "의 나이는 " + p[i].age + "입니다.");
		}

		// 방법3
		System.out.println("---------------------------------");
		int i = 0;
		for (Person pe : p) {
			pe = new Person(21 + i, "홍길동" + i);
			System.out.println(pe.name + "의 나이는" + pe.age + "입니다.");
			i++;
		}

	}

}

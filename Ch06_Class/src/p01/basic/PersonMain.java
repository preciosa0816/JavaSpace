package p01.basic;

//변수에 값을 저장하고 사용, 변경하기 : 데이터  
public class PersonMain {

	public static void main(String[] args) {

		// 1. 클래스에 초기값 저장하는 방법(미리 클래스에 값이 저장되어있을 때)
		Person p1 = new Person();	// 초기에 컴파일러가 기본생성자를 내부적으로 자동생성
		System.out.println(p1.name);
		System.out.println(p1.age);

		// 2. 클래스 변수에 초기값 저장하는 방법
		Person p2 = new Person();
		p2.name = "홍길동2";
		p2.age = 32;
		System.out.println(p2.name);
		System.out.println(p2.age);

		// 3. 생성자를 사용하는 방법
		Person p3 = new Person("홍길동3", 33);
		System.out.println(p3.name);
		System.out.println(p3.age);

		// 4.getter() & setter() 방법
		Person p4 = new Person();
		p4.setName("홍길동4");
		p4.setAge(34);
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		
		// 5. 기본생성자에 값을 저장
		Person p5 = new Person();
		
		System.out.println(p5.getName());
		System.out.println(p5.getAge());
		
		System.out.println(p5); //주소값 , 바꾸려면 Person클래스에서 toString활성화
		System.out.println(p5.toString()); //위의 값과 동일; toString이 생략된 것을 알 수 있음.
		
		String s1 = new String("홍길동");
		System.out.println(s1);//홍길동 , 
		//왜 주소값이 아닐까?(String을 만든 사람이 내부적으로 overriding이 된것임)
		
	
	}
	

}

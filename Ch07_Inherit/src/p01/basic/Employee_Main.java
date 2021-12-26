package p01.basic;

public class Employee_Main {

	public static void main(String[] args) {
		
		//1. 일반 객체 생성(부모가 아님)
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.salary=1000;		
		System.out.println(e1.name+":"+e1.getSalary());
		
		Employee e2 = new Employee("홍길동", 1000);
		System.out.println(e2.getEmployee());
		
		
		System.out.println("=========inherit=========");
		
		//2. 부모클래스(Employee)
		Manager m = new Manager("알파고", 2000, "개발");
		
		System.out.println(m.name);
		System.out.println(m.getSalary()); 
		System.out.println(m.depart); 
		System.out.println(m.getEmployee());
		
			// 같은 내용|.|
		System.out.println(m);
		System.out.println(m.toString());
		
		//3. Polymorphism(다형성)
		//하나의 부모타입으로 여러 자식객체를 가리키는 것
		Employee e3 = new Manager("베타고", 3000, "sw개발"); //부모의 눈으로 생성된 자식을 봄
													// 자식만 가진 depart부분이 보이지 않음
		
		
		// 형변환을 통해 자식의 depart를 보기 
		//클래스 세계에서의 형변환은 상속이 전제가 되어야함
		
		System.out.println(e3.name); //o
		System.out.println(e3.getSalary()); //o
		
//		System.out.println(e3.depart); //x+++++++++++
		
		System.out.println(e3.getEmployee());//o
		System.out.println(e3);//o
		System.out.println(e3.toString());//o
		
	}

}

package p07.polymorphism;
//instanceof: 형변환 가능 여부를 판단하는 연산자
public class Employee {
										//Parameter의 다형성
	public void taxRate(Employee e) { //메소드에 클래스를 통째로 넘겨줌. 파라미터 변수,로컬변수, 
														//하나의 부모객체로 여러 자식객체 사용하기위한 목적
		if(e instanceof Manager) {
			Manager m=(Manager) e; //casting
			System.out.println("Manager의 세금 구하기");
		}else if (e instanceof Engineer) {
			Engineer en = (Engineer) e;//casting
			System.out.println("Engineer의 세금 구하기");
		}else if(e instanceof Employee) {
			System.out.println("Employee의 세금 구하기");
		}
	}
}

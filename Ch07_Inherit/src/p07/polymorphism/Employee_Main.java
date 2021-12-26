package p07.polymorphism;

public class Employee_Main {

	public static void main(String[] args) {
		//1. 따로 생성하기
		Employee emp=new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		
		emp.taxRate(emp);
		man.taxRate(man);
		eng.taxRate(eng);
		

	}

}

package p05.system;

//쓰레기 수집기 실행(gc())
public class GcExample {

	public static void main(String[] args) {
		Employee emp;

		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
//		Employee emp2 = new Employee(1);	//위의 값과는 다르다.
//		Employee emp3 = new Employee(2);
//		Employee emp4 = new Employee(3);

		System.out.print("emp가 최종적으로 참조하는 사원번호:");
		System.out.println(emp.eno);
		System.gc();//객체 소멸
	}
}

class Employee {
	public int eno;

	public Employee(int eno) {
		// super();
		this.eno = eno;
		System.out.println("Employee(" + eno + ")이 메모리에서 생성됨");
	}

	public void finalize() {
		System.out.println("Employee(" + eno + ")이 메모리에서 제거됨");
	}

}

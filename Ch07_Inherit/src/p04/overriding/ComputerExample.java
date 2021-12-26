package p04.overriding;

public class ComputerExample {

	public static void main(String[] args) {
		int r=10;
		
		Calculator calculater = new Calculator();
		System.out.println("원면적 : "+calculater.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : "+computer.areaCircle(r));
	}

}

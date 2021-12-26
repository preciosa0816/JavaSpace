package p08.method;

public class CalculatorSExample {

	public static void main(String[] args) {
		CalculatorS myCal = new CalculatorS();
		
		//정사각형의 넓이 구하기
		double result1=myCal.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2=myCal.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형의 넓이:"+result1);
		System.out.println("직사각형의 넓이:"+result2);

	}

}

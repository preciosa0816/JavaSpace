package p07.constructor;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
// 생성자 : 객체 생성시 초기값 저장용도	
			//생성자 이름 : 클래스 이름, 반환형 타입(void,int,,,)x, return x
//생성자오버로딩	 : 같은 생성자 이름이면서 파라미터 타입이 서로 다르거나, 개수,순서가 다른 것
	public Car() {
		
	}
	
	public Car(String model) {
		//super(); //부모생성자(object)호출
		this.model = model;
	}
	public Car(int model) { //파라미터 타입의 수와 타입이 다르므로 생성자 오버로딩이다.
		//super(); 
		//this.model = model;
	}
	
//	public Car(String m) { //파라미터가 같은 타입이므로 생성자 overloading x
//		//super(); //부모생성자(object)호출
//		this.model = m;
//	}

		//super:부모클래스 
		//super():부모의 기본생성자 호출
		//this : 현재클래스
		//this():현재클래스의 기본생성자 호출
	public Car(String model, String color) {
		//super(); //()있는건 생성자
		this.model = model; // this: 현재클래스
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		//super();
		this(model,color); //현재 클래스의 다른 생성자 호출(public Car(String model, String color))
		//this.model = model;
		//this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
//생성자오버로딩
	
	

	
	
	
	
}

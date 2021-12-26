package p01.variable;
//35p
// class: 벽돌 공장의 틀, 자동차 공장의 설계도
public class VariableExample {
//main():프로그램의 시작점
	
	public static void main(String[] args) {
		//10을 변수 value의 초기값으로 저장
		//datatype variable = literal;
		int value =10;
		double value2=10.0;
		int value3 = (int) value2;
				
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value+10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(result);
		abc();
		
		
		
		//객체생성: 메소드나 변수를 RAM에 올려놓는 것
					// 클래스를 통째로 복사해서 RAM에 저장=>CPU가 실시간으로 가져다 사용
		VariableExample v = new VariableExample();
		v.abc2(); //v. 하고 ctrl+space 했을때 abc2가 보임

		
		
	}
	//ram에 올리려면 void 앞에 static을 붙이면 됨, 남발하면 RAM이 꽉참
	static void abc() {
		System.out.println("abc");
	}
	void abc2() {
		System.out.println("abc2");
	}	
	
	

}

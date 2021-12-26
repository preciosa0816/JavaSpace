package p01.basic;

//클래스 구성요소//
public class ClassEx1 {
//1.변수(field)
	int a;
	static double b;
	
//2. method
	int methodA(int k) {
		System.out.println();
		return k;
	}

	static int methodB(double d) {
		System.out.println(d);
		return (int)d;
	}

	

	public static void main(String[] args) {
		int c;

	}
	//3. 생성자
	
	public ClassEx1() {//기본생성자
		
	}
	public ClassEx1(int a) {//파라미터가 있는 생성자
		super();
		this.a = a;
	}
	
	//4. Initial Block
	{
		System.out.println("인스턴스 초기화 블럭"); //heap영역, 개체생성시만 동작
		
	}
	static {
		System.out.println("static 초기화 블록");
	}
	
}

class a { //요즘은 이렇게 쓰지 않음. 따로 class 만들어서 분리해주기

}




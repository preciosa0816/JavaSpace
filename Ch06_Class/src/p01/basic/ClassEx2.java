package p01.basic;

//클래스 구성요소//
public class ClassEx2 {
//1.변수(field)
	int a;
	static double b;
	
//2. method
	int methodA(int k) {//10
		System.out.println(k);
		return k+10;
	}

	static int methodB(double d) {//20.0
		System.out.println(d);
		return (int)d+20;
	}

	
	//프로그램의 시작점
	public static void main(String[] args) {
		int c;
		
		ClassEx2 ce=new ClassEx2();
		ClassEx2 ce1=new ClassEx2();
		System.out.println(ce.a);
		System.out.println(b);
		
		System.out.println(ce.methodA(10));
		//methodB(20.0);
		System.out.println(methodB(20.0));

	}
	//3. 생성자
	
	public ClassEx2() {//기본생성자
		System.out.println("기본생성자");//객체가 생성될떄 반복해서 출력됨
		
	}
	public ClassEx2(int a) {//파라미터가 있는 생성자
		super();
		this.a = a;
	}
	
	//4. Initial Block
	{
		System.out.println("인스턴스 초기화 블럭"); //heap영역, 개체생성시만 동작
																//객체가 생성될떄 반복해서 출력됨 기본생성자보다 먼저수행
	}
	static {
		System.out.println("static 초기화 블록");
	}
	
}

//class a2 { //하나의 패키지에 똑같은클래스가 존재할 수 없음
//
//}




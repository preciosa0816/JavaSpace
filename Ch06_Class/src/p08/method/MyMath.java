package p08.method;

public class MyMath {
	
	//Method Overloading : 메소드 이름과 반환형 타입이 일치하고, 
	//								  파라미터 타입이나 개수가 서로 다른 것
	int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	//void:메소드를 수행하고, 결과값은 리턴하지 않겠다.
	void add(int a, long b) { 
		System.out.println(a+b);
		return;
	}
	
	long add(long a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	int add(long a, long b) {
		System.out.println(a+b);
		return (int) (a+b);
	}
	
	int add(int[]a) {
		System.out.println("int add(int[]a)");
		//배열의 내용 출력
		int result=0;		
		for (int i=0;i<a.length;i++) {
			result+= a[i];
		}
		return result;
	}
	
	
}

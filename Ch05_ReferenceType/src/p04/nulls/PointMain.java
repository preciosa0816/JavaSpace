package p04.nulls;

public class PointMain {
	
	int a =100; //기본형타입 변수: 실제값 (한개의 값)
	
	//method영역(static변수, static메소드)
	public static void main(String[] args) {
		
		//참조 타입->생성된 클래스덩어리가 메모리에 있는 것
		//참조타입 참조변수:주소값이 들어있다.
		
		
		//stack영역(p), Heap영역(new Point(10, 20))
		Point p = new Point(10, 20); //객체생성			//(주소값, 많은 내용쓸수있음)
		System.out.println(p); //주소값 출력
		System.out.println(p.x);			// point클래스와 비교하기!
		System.out.println(p.y);
		System.out.println("---------------------");
		Point p2 = p; //주소값 복사 및 저장
		
		System.out.println(p2.x);			// 
		System.out.println(p2.y);
		System.out.println("---------------------");
		p2.x =30;
		p2.y=40;
		System.out.println(p2.x);			// 값이 변경됨
		System.out.println(p2.y);
		System.out.println("---------------------");
		
		rearArrange(p); //argument , 주소값가지고있음
		System.out.println(p.x);			//50
		System.out.println(p.y);			//60
		
		rearArrange(p2); //
		System.out.println(p2.x);			//50
		System.out.println(p2.y);			//60
		
		rearArrange2(2); 
		
		
	}
		static void rearArrange(Point point) { //parameter //Point클래스 주소값가지고있음
			point.x=50; //주소값을 따라가면 x가 있고 거기에 50을 넣기
			point.y=60;
			
		}
		static void rearArrange2(int x) { //실제값 2를 가지고있음
			int x2=x; 
			int y=60;
			System.out.println(x2+":"+y);
		}

}

package p04.nulls;

public class PointEx1 {
	
	Point p1 ; //전역변수+메인메소드 밖에서 선언,Point p1 = null;(메인메소드안에서)과 비교
	
	public static void main(String[] args) {
		/*
		 * Point p1; 						//주소값 가르키지 않아서 에러 
		 * System.out.println(p1.x);
		 * System.out.println(p1.y);
		 */
		int b=0;//메소드 안에서 선언된 변수(참조, 기본형)는 반드시 초기화!
		Point p1 = null; //클래스타입의 기본값은 null (초기화를 위해 써야함)
								//컴파일 에러는 해결되었으나, 실행에러 발생
		
			System.out.println(p1.x);
			System.out.println(p1.y);
			System.out.println(b);
		
			Point p2 = new Point(10, 20);
			Point p3=new Point(); //x:30,y:40
			p3.x=30;
			p3.y=40;
			System.out.println(p3.x+":"+p3.y);
			System.out.println(p2.x+","+p2.y);
	}

}

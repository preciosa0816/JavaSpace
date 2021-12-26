package p03.object.clone;

import java.util.GregorianCalendar;

public class CloneEx1 {
	
	public static void main(String[] args) {//jvm에 오류 전가
		
		//1. 자바개발자가 만든 클래스인 경우 clone() 사용
		GregorianCalendar g1 = new GregorianCalendar(2019, 6, 24);
		GregorianCalendar g2 = (GregorianCalendar) g1.clone();
		System.out.printf("%tF %n",g1); //2019-07-24
		System.out.printf("%tF %n",g2); //2019-07-24
		
		System.out.println(g1.equals(g2));
		
		//2.응용개발자인 경우 clone()을 반드시 재정의
		Rectangle r1 = new Rectangle(10, 20); //내가만든 클래스는 재정의가 되기전 clone 사용불가 
		Rectangle r2 = (Rectangle) r1.clone(); 
		System.out.println(r1.width+" : "+r1.height);
		System.out.println(r2.width+" : "+r2.height);
		System.out.println(r1.equals(r2)); // equal 재정의 안하면 false로 나옴.
	}
	
	
}

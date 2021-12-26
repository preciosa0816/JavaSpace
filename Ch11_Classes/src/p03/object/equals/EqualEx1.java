package p03.object.equals;
//equlas(): 객체비교, 문자열 비교
import java.util.GregorianCalendar;

public class EqualEx1 {

	public static void main(String[] args) {//1970/1/1부터 표현가능함 그 이전은 x
		GregorianCalendar g1 = new GregorianCalendar(2019, 0, 31);
		GregorianCalendar g2 = new GregorianCalendar(2019, 0, 31);
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g1.equals(g2));
		
		if(g1.equals(g2)) {//자바 개발자가 만든 클래스이므로 같은 객체는 "동일한 ~"이라고 표시
			System.out.println("동일한 값입니다.");
		}else {
			System.out.println("다른 값입니다.");
			
		}
		
		
		System.out.println();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		System.out.println(c1);
		System.out.println(c2);
		
		if(c1.equals(c2)) //내용이 같지만 다름이 출력됨
			System.out.println("같음");
		else
			System.out.println("다름"); 
		
		
		
		
		
	}

}

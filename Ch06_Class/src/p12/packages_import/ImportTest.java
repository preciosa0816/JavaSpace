package p12.packages_import;

import java.text.SimpleDateFormat;
//기본 import : java.lang 패키지를 의미(생략)
//그 나머지는 반드시 import표시
//import java.util.Calendar;
import java.util.Date;
import static java.lang.System.out;
import static java.lang.Math.*;

// 날짜/시간 클래스 : Date -> Calendar -> LocalDateTime
public class ImportTest {

	public static void main(String[] args) {
		// Calendar c= Calendar.getInstance();
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		System.out.println("지금 날짜와 시간은 " + sf.format(d));

		System.out.println(Math.random());		
		System.out.println(Math.PI); //static , final 이 들어가있는 상수임
		
		//static Import (Java 8)
		out.println(random());		//system과 Math을 import해옴
		out.println(PI);
		
		
	}

}

package p16.java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime1_Create {

	public static void main(String[] args) {
		//Calendar는 상속이 안됨
		Calendar today  = Calendar.getInstance(); //이전버전
		System.out.println(today.get(Calendar.YEAR));
		
		//Calendar를 상속받아 쓰는것 = gregoriancalendar
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.get(Calendar.YEAR));
		
		//Java8 time추가 
		LocalDate ld= LocalDate.now();
		System.out.println("현재 날짜 : "+ld);

		LocalTime lt = LocalTime.now();
		System.out.println("현재 시간 : "+lt);
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : "+ldt);		
		
		ZonedDateTime zdt= ZonedDateTime.now();
		System.out.println("Zone 날짜와 시간 : "+zdt);
		
		
		
		
	}

}

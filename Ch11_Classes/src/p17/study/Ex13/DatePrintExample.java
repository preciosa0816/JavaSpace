package p17.study.Ex13;

import java.text.SimpleDateFormat;
import java.util.Date;
//오늘의 날짜 출력하기
public class DatePrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sd.format(now));
		
	}

}

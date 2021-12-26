package p05.buffered_inputstream;

import java.util.Date;

public class PrintfExample {

	public static void main(String[] args) {
		
		/*%d : 정수
		 *%6d: 6자리 정수. 왼쪽 빈자리 공백
		 * %-6d : 6자리 정수. 오른쪽 빈자리 공백
		 * %06d : 6자리 정수. 왼쪽 빈자리 0
		 * 
		 * %10.2f : 소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈자리 공백
		 * %-10.2f : 소수점 이상 7자리, 소수정 이하 2자리, 오른쪽 빈자리 공백
		 * %010.2f :소수점 이상 7자리, 소수점 이하 2자리, 왼쪽 빈자리 0 채움
		 * 
		 * %s : 문자열
		 * %6s : 6자리 문자열, 왼쪽 빈자리 공백
		 * %-6s : 6자리 문자열 오른쪽 빈자리공백
		 * %tF : %tY-%tm-%td
		 * %tY : 4자리 년
		 * %ty : 2자리 년
		 * %tm : 2자리 월
		 * %td : 2자리 일
		 * %tH : 2자리 시(0~23)
		 * %tl : 시(0~12)
		 * %tM : 2자리 분
		 * %tS : 2자리 초
		 *"/t" = 탭
		 *"/n"=줄바꿈
		 *%%=%
		 */
			
		
		System.out.printf("상품의 가격 : %d원\n",123);
		System.out.printf("상품의 가격 : %6d원\n",123);
		System.out.printf("상품의 가격 : %-6d원\n",123);
		System.out.printf("상품의 가격 : %06d원\n",123);
		
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n",10,Math.PI*10*10);
		
		System.out.printf("%6d | %-10s |%10s\n",1,"홍길동","도적");
		
		Date now = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다\n",now,now,now);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다\n",now);
		System.out.printf("현재 %1$tH시 %1$tM분 %1$tS초 입니다.\n",now);
		

	}

}

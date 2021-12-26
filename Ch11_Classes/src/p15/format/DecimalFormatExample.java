package p15.format;

import java.text.DecimalFormat;
//숫자데이터를 원하는 형식으로 표현
public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat d = new DecimalFormat("0"); //0의 자리까지 반올림 / 1234568
		System.out.println(d.format(num));
		
		DecimalFormat d2 = new DecimalFormat("0.0"); //0의 소숫점1자리까지 반올림/1234567.9
		System.out.println(d2.format(num))	;
		
		DecimalFormat d3 = new DecimalFormat("00000000.00000"); //01234567.89000
		System.out.println(d3.format(num));
		
		DecimalFormat d5 = new DecimalFormat("#.#"); //0의 소숫점1자리까지 반올림/1234567.9
		System.out.println(d5.format(num))	;
		
		DecimalFormat da = new DecimalFormat("#############.0"); //0의 소숫점1자리까지 반올림, 
		System.out.println("#############.0 : "+da.format(num))	;
		
		DecimalFormat db = new DecimalFormat("+#.0"); 
		System.out.println("+#.# : "+db.format(num))	;
		
		DecimalFormat dc = new DecimalFormat("-#.0"); 
		System.out.println("-#.# : "+dc.format(num))	;
		
		DecimalFormat de = new DecimalFormat("#,###.0"); 
		System.out.println("#,###.0 : "+de.format(num))	;
		
		DecimalFormat df = new DecimalFormat("0.0E0"); 
		System.out.println("0.0E0 : "+df.format(num))	;//1.2E6
		
		DecimalFormat dg = new DecimalFormat("+#,### ; -#,###"); 
		System.out.println("+#,### ; -#,### = "+dg.format(num))	;
		
		DecimalFormat dh = new DecimalFormat("\u00A4 #,###"); 
		System.out.println("\\u00A4 #,### : "+dh.format(num))	;
				
		DecimalFormat d4 = new DecimalFormat("##########.#####"); //1234567.89 
		System.out.println(d4.format(num)); //# : 유효한 자리수만 남겨놓고 지움
		
		DecimalFormat d6 = new DecimalFormat("+$#,###,###,###.000 %"); //1234567.89 
		System.out.println(d6.format(num)); //#, : 화폐단위 표시 //+%$다 사용가능
		
		
		

	}

}

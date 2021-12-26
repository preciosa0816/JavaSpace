package p01.basic;
//자바: 대소문자 구분
// 		 이식성
public class Hello{
	/*
	 * 메인 메소드 : 프로그램의 시작 메소드 안에서는 순차적 실행
	 * 
	 */
		public static void main(String[] args){
		System.out.println("Hello Java");
		int total=0;
		for(int cnt=1; cnt<=10; cnt++){
			total = total+cnt;
		}
		System.out.println("1+2+...10="+total);
	}

}

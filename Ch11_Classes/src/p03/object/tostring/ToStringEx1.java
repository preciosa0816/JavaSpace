package p03.object.tostring;

import java.io.File;

public class ToStringEx1 {
	public static void main(String[] args) {
		//toString() : 문자열 출력
		File f = new File("C:\\Spring"); //file을 import해옴
		System.out.println(f); //원래 주소값이 나옴 but 개발자가 ""안의 값이 나오도록 설정해놓음(문자열)
		System.out.println(f.toString());
		
		System.out.println();
		
		//goodsCode:1111, stockNum:200
		
		GoodStock g = new GoodStock("1111", 200);
		System.out.println(g);	 	//주소값출력 : 내가만든 클래스 //toString 재정의후에는 재정의 값 출력
		System.out.println(g.toString());//주소값출력 : 내가만든 클래스 //변형후에는 재정의된 값 출력
		
		
		
	}
}

package p04.objects;

import java.util.Objects;
//객체 문자 정보(toString())
public class ToStringExample {

	public static void main(String[] args) {
		String str1= "홍길동";
		String str2 = null;
		
		//toString(Object o) : not null->o.toString() / null->"null"
		//toString(Object o, String nullDefault) : not null->o.toString() / null->nullDefault
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"이름이 없습니다."));

	}

}

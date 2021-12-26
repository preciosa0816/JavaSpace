package p01.basic;

import java.util.ArrayList;

public class GenericBegin {

	public static void main(String[] args) {

		// 1. <제네릭스를 사용하지 않은 경우(이전버전)>
		ArrayList a1 = new ArrayList();
		// a1.add(new Integer("1"));
		a1.add(1);
		// a1.add(new String("string"));
		a1.add("string");
		// a1.add(Phone); //Phone클래스 삽입X
		a1.add(new Phone()); // 객체생성하기 //재정의 전에는 주소값출력

		System.out.println(a1);
		// Casting (형변환)해야한다.
		int c1 = (int) a1.get(0); // object->Integer 변환
		String c2 = (String) a1.get(1); // object->String 변환
		Phone c3 = (Phone) a1.get(2); // object->Phone 변환

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println("-------------");

		//Generic을 사용한 경우 : '형변환 불필요', 강한 타입체크
		// 2. Generic을 사용한 경우
		// (1)<String>제네릭스를 사용한 경우
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("string");
		a2.add("2");
		for (String s : a2)
			System.out.println(s);

		// 3. Generic을 사용한 경우
		// (2)<Integer>제네릭스를 사용한 경우
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(1);
		a3.add(3);
		for (Integer s : a3)
			System.out.println(s);
		System.out.println();
		// 4. Generic을 사용한 경우
		// (3)<phone>제네릭스를 사용한 경우
		ArrayList<Phone> a4 = new ArrayList<>();
		Phone p = new Phone();
		a4.add(p); //Phone class입니다.
		a4.add(new Phone("New Phone")); //재정의,파라미터가 있는 변수
		for (Phone s : a4)
			System.out.println(s);

	}

}

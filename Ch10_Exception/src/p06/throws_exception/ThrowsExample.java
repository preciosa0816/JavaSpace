package p06.throws_exception;

import p05.trywithresources.FileInputSteam;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findclass();	//3
			
		} catch (ClassNotFoundException e) {
			System.out.println("패키지에서 해당 클래스가 존재하지 않습니다.");
		}
		System.out.println("Done");
	}

	public static void findclass() throws ClassNotFoundException {	//2
		Class c = Class.forName("java.lang.String2");	//1 순서대로 책임을 전가함
	}

}

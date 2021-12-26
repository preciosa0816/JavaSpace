package p10.projectagain;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		boolean run = true;
		Teacher t = new Teacher();
//		Student s = new Student();
		

		while (run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 총점 출력");
			System.out.println("3. 학생 평균 출력");
			System.out.println("4. 프로그램 종료");
			int number = sc.nextInt();

			if (number == 1) {
				t.inPut();
				System.out.println("====입력완료====");
			} else if (number == 2) {
				System.out.println(t.s.name + " : " + t.sum()); //teacher class에 sum()을 만들어놓고 부르기만해도 좋음.
			} else if (number == 3) {
				System.out.println(t.s.name + " : " + t.avr());
			} else if (number == 4) {
				run = false;
				System.out.println("시스템을 종료합니다.");
			} else {
				System.out.println("1~4만 입력해주세요");
			}
			sc.close();
		}

	}

}

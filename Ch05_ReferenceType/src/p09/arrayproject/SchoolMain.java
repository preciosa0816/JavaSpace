package p09.arrayproject;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {

		Student s[] = null;
		boolean run = true;
		int sum=0;
		// s[i] = new Student(name, kor, math, eng);
		int studentNum = 0;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 총점 입력");
			System.out.println("3.학생 평균 입력");
			System.out.println("4.프로그램 종료");
			
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.println("학생 수 :");
				studentNum = sc.nextInt();
				s = new Student[studentNum];
				// s = new Student[studentNum];

				for (int i = 0; i < s.length; i++) {
					System.out.println("학생 이름 입력 :");
					String name = sc.next();

					System.out.println(name + "의 국어점수");
					int kor = sc.nextInt();

					System.out.println(name + "의 영어점수");
					int eng = sc.nextInt();

					System.out.println(name + "의 수학점수");
					int math = sc.nextInt();
					s[i] = new Student(name, kor, math, eng);

				}
				continue;

			} else if (selectNo == 2) {
				
				for(int i=0;i<s.length;i++) {
					sum=s[i].eng+s[i].kor+s[i].math;
					System.out.println(s[i].name+"의 총점:"+sum);
				}
				
			} else if (selectNo == 3) {
				double avr=0;
				
				for(int i=0;i<s.length;i++) {					
				avr=(double)sum/3;
				System.out.println(s[i].name+"의 평균:"+avr);
				}
			} else if (selectNo == 4) {
				run = false;
			} else {
				System.out.println("다시 입력해주세요");
			}
			 
		}sc.close();

	}
}

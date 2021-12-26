package p09.arrayproject;

import java.util.Scanner;

public class Teacher {

	//클래스 변수
		Student s;
		
		// 생성자
		
		//학생 정보 입력
		
		public void input() {
			Scanner sc = new Scanner(System.in);
			System.out.println("학생 이름 입력 :");
			String name=sc.nextLine();
			
			System.out.println(name+"의 국어점수");
			int kor=sc.nextInt();
			
			System.out.println(name+"의 영어점수");
			int eng=sc.nextInt();
			
			System.out.println(name+"의 수학점수");
			int math=sc.nextInt();
			s = new Student(name, kor, math, eng);
			sc.close();
			
		}
		
		//합계(sum)
		public int sum=s.kor+s.eng+s.math;
		
		//평균(avr)
		public double avr=sum;
	}



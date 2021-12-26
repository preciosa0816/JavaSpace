package p10.projectagain;

import java.util.Scanner;

public class Teacher {
//클래스 변수
	Student s;
	
	
	// 생성자
	
	// 학생정보입력

	public void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 입력: ");
		String name=sc.next();
		
		System.out.println(name+"의 국어점수");
		int kor = sc.nextInt();	//s.kor = sc.nextInt();도 가능************
		
		System.out.println(name+"의 영어점수");
		int eng = sc.nextInt();
		
		System.out.println(name+"의 수학점수");
		int math = sc.nextInt();
		
		s=new Student(name, kor, eng, math);
		sc.close();
	}
	// 합계(sum)
	public int sum() {
		int sum=s.eng+s.kor+s.math;
		return sum;
	}

	// 평균(avr)
	public double avr() {
		double avr= (double)this.sum()/3;
		return avr;
	}
	public Teacher() {
		
	}
}

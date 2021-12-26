package p08.study.q7;

import java.util.function.ToIntFunction;

public class LambdaExample {

	private static Student[] students= {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)		
	};
	
	private static double avg(ToIntFunction<Student> s) {
		int sum=0;
		for(Student k : students)
			sum+=s.applyAsInt(k);
		double avg = (double)sum/students.length;
		return avg;
	}
	
	// 메소드 참조식으로 변경하기****
	public static void main(String[] args) {
		double EngAvg = avg(new ToIntFunction<LambdaExample.Student>() {			
			@Override
			public int applyAsInt(Student s) {
				int en =s.getEnglishScore();
				return en;
			}			
		});
		
		System.out.println("영어 평균 점수 : "+EngAvg);
		
		double MathAvg = avg(new ToIntFunction<LambdaExample.Student>() {			
			@Override
			public int applyAsInt(Student s) {
				int math =s.getMathScore();
				return math;
			}			
		});
		
		System.out.println("수학 평균 점수 : "+MathAvg);
		
		
	}
	public static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() {return name;}
		public int getEnglishScore() {return englishScore;}
		public int getMathScore() {return mathScore;}
		
		
	}

}

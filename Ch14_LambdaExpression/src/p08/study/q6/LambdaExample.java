package p08.study.q6;

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
	
	
	public static void main(String[] args) {
		double EngAvg = avg(s->s.getEnglishScore());
		System.out.println("영어 평균 점수 : "+EngAvg);
		
		double mathAvg = avg(s->s.getMathScore());
		System.out.println("수학 평균 점수 : "+mathAvg);

		
		
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

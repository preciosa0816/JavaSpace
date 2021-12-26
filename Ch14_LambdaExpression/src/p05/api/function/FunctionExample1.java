package p05.api.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
//Function(): 매개값+ 리턴값 모두 가짐
//List에 저장된 객체를 꺼내서 하나씩 이름과 점수를 출력하기
public class FunctionExample1 {
		//List에 학생점수 저장하기
		private static List<Student> list = 
						Arrays.asList(new Student("홍길동", 90, 96),
										new Student("알파고", 95, 93));
		
//		Function<Student, String> tf = (t)->t.getName();			
//		

//		Function<String, Integer> f= new Function<String, Integer>() {
//		@Override
//		public Integer apply(String t) {
//			return null;
//		}
//	};
												
		//학생을 입력해서 이름출력 메소드		//Function<T, R> :타입 , tf:변수
		private static void printString(Function<Student, String> tf) {
			for(Student sf : list) //리스트에 저장된 항목 수 만큼 루핑
				System.out.print(tf.apply(sf)+" ");
				System.out.println();						
		}
		
		
		//학생 입력된 점수 출력 메소드
		private static void printInt(ToIntFunction<Student> tf) {
			for(Student sf : list) 
				System.out.print(tf.applyAsInt(sf)+" ");
				System.out.println();						
		}
		
		//학생 입력된 평균점수 
		private static double avg(ToIntFunction<Student> tf) {
			int sum=0;
			for(Student sf : list) 	
				sum+=tf.applyAsInt(sf); 
				double avg=(double)sum/list.size();
				return avg;		
		}
		
		public static void main(String[] args) {
			
			System.out.println("학생이름 :");
			printString(t->t.getName());
			System.out.println("영어 점수 : ");
			printInt(t->t.getEnglishScore());
			
			double EngAvg = avg(t->t.getEnglishScore());
			System.out.println("영어 평균점수 : "+EngAvg);
			System.out.println("수학 점수 : ");
			printInt(t->t.getMathScore());
			
			double mathAvg = avg(t->t.getMathScore());
			System.out.println("수학 평균점수 : " + mathAvg);
			
//		Function<String, Integer> f= new Function<String, Integer>() {
//			
//			@Override
//			public Integer apply(String t) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//			
			
			
		

	}
		
}

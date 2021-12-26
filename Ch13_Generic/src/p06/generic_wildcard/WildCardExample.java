package p06.generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	// 모든 과정(?): Person, Worker, Student, HighStudent
	public static void registerCourse(Course<?> c) {		
		System.out.println(c.getName()+" 수강생 : "+Arrays.toString(c.getStudent()));
	}
	// 학생과정: Student, HighStudent
	public static void registerStudent(Course<? extends Student> c) {	//Student클래스와 자식객체	
		System.out.println(c.getName()+" 수강생 : "+Arrays.toString(c.getStudent()));
	}
	
	// 직장인과정: Worker
	public static void registerWorker(Course<? super Worker> c) {		//Worker클래스와 부모객체
		System.out.println(c.getName()+" 수강생 : "+Arrays.toString(c.getStudent()));
	}
	
	public static void main(String[] args) {
		//일반인 과정(모든과정)		
		Course<Person> p = new Course<Person>("일반인과정", 5);
		p.add(new Person("일반인"));
		p.add(new Worker("직장인"));
		p.add(new Student("학생"));
		p.add(new HighStudent("고등학생"));
		
		//학생 과정(모든과정)		
		Course<Student> s = new Course<Student>("학생과정", 5);
		s.add(new Student("학생"));
		s.add(new HighStudent("고등학생"));
		
		//일반인 과정(모든과정)		
		Course<HighStudent> h = new Course<HighStudent>("고등학생과정", 5);
		h.add(new HighStudent("고등학생"));
		
		//일반인 과정(모든과정)		
		Course<Worker> w = new Course<Worker>("직장인과정", 5);
		w.add(new Worker("직장인"));
		
		//parameter의 다형성
		registerCourse(p);
		registerCourse(w);
		registerCourse(s);
		registerCourse(h);
		
		//registerStudent(p); //**********************
		//registerStudent(w);
		registerStudent(s);
		registerStudent(h);
		
		registerWorker(p);//**************************
		registerWorker(w);
		//registerWorker(s);
		//registerWorker(h);
		
	
	}

	
}

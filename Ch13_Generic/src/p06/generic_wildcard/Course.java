package p06.generic_wildcard;

public class Course<T> {
	private String name;
	private T[] students;
	public Course(String name, int capacty) {
		super();
		this.name = name;
		this.students = (T[]) new Object[capacty];
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T[] getStudent() {
		return students;
	}
	public void setStudent(T[] students) {
		this.students = students;
	}
	
	//배열에 비어있는 부분을 찾아서 수강생을 추가
	public void add(T t) {
		for (int i=0; i<students.length;i++) {
			if(students[i]==null) {
				students[i] =t;
				break;
			}
		}
	}
	
	
}

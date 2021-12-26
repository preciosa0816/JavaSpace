package p17.study.Ex3;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	//코드작성
	
	@Override
	public int hashCode() {
		
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			if(studentNum.equals(s.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	
}

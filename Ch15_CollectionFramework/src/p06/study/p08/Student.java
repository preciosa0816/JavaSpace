package p06.study.p08;


public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {		
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
			return false;
		Student p = (Student) obj;
		if((this.studentNum==p.studentNum)){ //학번만비교하기		
			return true;
		}
		else
			return false;
	}
	
	
}

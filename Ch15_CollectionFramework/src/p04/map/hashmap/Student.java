package p04.map.hashmap;


public class Student {
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))
			return false;
		Student s = (Student) obj;
		if((this.sno==s.sno)&&(name.equals(s.name))){
			
			return true;
		}
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		
		return (sno+name).hashCode();
	}
	
}

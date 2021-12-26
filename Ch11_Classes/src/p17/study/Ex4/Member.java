package p17.study.Ex4;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	//여기서 코드 작성
	
	@Override
	public String toString() {
		
		return id+":"+name;
	}
}

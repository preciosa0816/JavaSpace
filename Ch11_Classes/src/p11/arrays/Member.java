package p11.arrays;

public class Member implements Comparable<Member> {
	String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	
	//compareTo():오름차순 일 때 자신이 매개값보다 낮을 경우 음수, 같을 경우 0, 높을 경우 음수 리턴.
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}

}

package p03.object.finalize;

public class Counter {
	private int no;

	public Counter(int no) {
		super();
		this.no = no;
	}
	
	//finalize():객체소멸 전 마지막으로 사용했던 자원을 닫고 싶거나 중요한 데이터를 저장하고 싶다면 재정의함
	@Override //finalize():어떤 객체가 소멸되는지 확인 가능 
	protected void finalize() throws Throwable {
		System.out.println(no+"번 객체의 finalize()가 실행됨");
		
	}
}

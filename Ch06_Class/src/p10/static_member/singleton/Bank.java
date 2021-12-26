package p10.static_member.singleton;
//singleton : 객체 생성은 한번만 한다.
//				   하나의 클래스에서 객체를 생성한 후 주소값이 들어있는 메소드를 메인클래스에서 메소드를 호출해서 사용
public class Bank {
	String name; // 은행이름
																//한번만
	private static Bank b = new Bank("신한은행2"); // "private static" 이 클래스 내에서만 사용
																		// "static" 누구나 공유
	
	
	public static Bank getBank() {//getter()와 다른것 //public붙이면 다른패키지및클래스에서 가져다쓸수있다.
												//유일하게 다른 클래스에 열려있음
		return b; //주소값 : 생성된 Bank객체
	}
	
	
	// 파라미터가 있는 생성자
	private Bank(String name) { //static 대신 private을 붙이면 현재 클래스 내에서만 사용가능
		super();
		this.name = name;
	}

	// getter()
	public String getName() {
		return name;
	}

	// setter()
	public void setName(String name) {
		this.name = name;
	}

}

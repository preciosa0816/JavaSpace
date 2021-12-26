package p05.anonymous;

public class SMSSender extends MessageSender{

	String phoneNo;
	String responsePhoneNo;
	


	public SMSSender(String phoneNo, String responsePhoneNo) {
		super();
		this.phoneNo = phoneNo;
		this.responsePhoneNo = responsePhoneNo;
	}


	@Override
	void send(String message) {
		System.out.println("전화번호 : "+phoneNo);
		System.out.println("회신 전화번호 : "+responsePhoneNo);
		System.out.println("내용 : " +message);
		System.out.println();
		
	}

}

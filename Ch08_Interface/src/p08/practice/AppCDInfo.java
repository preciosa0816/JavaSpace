package p08.practice;

public class AppCDInfo extends CDInfo implements Lendable {
	String borrower;
	String checkOutDate;
	byte state;
	

	
	



	public AppCDInfo(String checkOutDate, String title) {
		super(checkOutDate, title);
		
		
	}
	
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state !=0)
			return;
		this.borrower = borrower;
		this.checkOutDate=date;
		this.state=1;
		
		
		
		this.checkOutDate=date;
		System.out.println("* "+title+" CD가 대출되었습니다" );
		System.out.println("대출인: "+borrower);
		System.out.println("대출일: "+checkOutDate);
		System.out.println();
	}

	@Override
	public void checkln() {
		this.state=0;
		System.out.println("* "+title+" CD가 반납되었습니다.");
		System.out.println();
		
	}

}

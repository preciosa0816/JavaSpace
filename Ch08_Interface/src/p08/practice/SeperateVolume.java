package p08.practice;

public class SeperateVolume implements Lendable {
String requestNo; //청구번호
String bookTitle; //제목
String writer; //저자
String borrower; //대출인
String checkOutDate; //대출일
byte state;// 대출상태 



// 작성

public SeperateVolume(String requestNo, String bookTitle, String writer) {
	super();
	this.requestNo = requestNo;
	this.bookTitle = bookTitle;
	this.writer = writer;
}



//인터페이스의 메소드를 구현시 반드시 public
@Override
public void checkOut(String borrower, String date) {
	if(state !=0)
		return;
	this.borrower = borrower;
	this.checkOutDate=date;
	this.state=1;
	
	System.out.println("* "+bookTitle+" 이(가) 대출되었습니다" );
	System.out.println("대출인: "+borrower);
	System.out.println("대출일: "+checkOutDate);
	System.out.println();
	
}

@Override
public void checkln() {
	this.state=0;
	System.out.println("* "+bookTitle+" 이(가) 반납되었습니다.");
	System.out.println();
	
}

}

package p09.study;

public class NotExistIDException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;// 클래스명에 노란밑줄이 생겨서 불러낸것(마우스오른쪽)
	public NotExistIDException() {
		
	}
public NotExistIDException(String message) {
	super(message);
		
	
	}
	
}

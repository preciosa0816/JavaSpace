package p07.userdefine;

//상속을 꼭 받아야함.
public class InvalidInputException extends Exception {
	// SCM(구성,향상,버전 관리) : 개발시 변경이력을 알기위한 내용.
	// Git (new) , SVN(old)
	private static final long serialVersionUID = 1L;
	
	public InvalidInputException() {
		super("잘못된 명령 입니다."); //super 에 괄호가 있는것은 부모의 생성자에 가서 알아보는 것
											// super(string)인곳에 가서 저장하기
		
		
		
	}

}

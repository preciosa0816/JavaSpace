package p01.basic;

public class Phone {
	
	private String app;//"Phone class입니다."저장
	
	public Phone() {
		this("Phone class입니다."); // 문자열을 불러내기 (app에 저장되는 내용)
	}

	public Phone(String app) {
		super();
		this.app = app;
		
	}
	@Override
	public String toString() {
		
		return app;
	}
	
	
}

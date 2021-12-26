package p13.access_modifier1;

//Private 접근제한자 : 클래스 앞 불가, [생성자, 변수, 메소드]앞 사용 가능
//							같은 클래스내에서만 사용가능

public class PrivateData {
	private PrivateData() {
		
	}
	private int a = 10;
	
	private void mothod() {
		System.out.println(100);
	}
	
	PrivateData p=new PrivateData();
	
	void result() {
	System.out.println(p.a);	//같은 클래스내 private변수 사용
	p.mothod();
	
	}
	
	
}

package p13.access_modifier1;

//Default 접근제한자 : [Class , 생성자, 변수, method]앞 사용가능
// 							같은 패키지내에서만 접근 가능
class DefaultData {
	
	public DefaultData() {
		
	}
	int defaultVar=20; //default 접근제한자
	
	int method() {
		return 10;
	}
	
}

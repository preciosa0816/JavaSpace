package p09.stringBuffer_stringBuilder;

public class StriingBuilderExample {
//문자열을 변경하는 작업이 많을 경우 StringBuffer / StringBuilder클래스 사용하는 것 권장
	//내부 버퍼에 문자열 저장후 그 안에서 추가,수정,삭제 작업을 할 수 있도록 설계, 새로운 객체 만들 필요x
	//StringBuffer는 멀티스레드 환경사용가능(동기화 적용) / StringBuilder는 단일스레드 환경에서 사용
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");//문자열을 끝에 추가
		sb.append("Program Study");
		System.out.println(sb.toString());
	
		sb.insert(4, "2");//index4 위치 뒤에 2를 삽입
		System.out.println(sb.toString());
	
		sb.setCharAt(4, '6');//index4 위치의 문자를 6으로 변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); //index6부터 index13'전'까지를 "BOOK"문자열로 대치
		System.out.println(sb.toString());
		
		sb.delete(4, 5);//index4 부터 index5 '전'까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length(); //총문자수 얻기
		System.out.println("총문자수 : "+length);
		
		String result = sb.toString(); //버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);
		
	}

}

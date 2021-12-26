package p17.study.Ex7;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바");//문자열찾기
		
		if(index==-1) { //검색시 찾는 문자열이 없을때(더이상 읽을 것이 없는 상태)
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str = str.replace("자바", "java");//자바를 java로 바꾸기(문자열바꾸기)
			System.out.println("->"+str);
		}

	}

}

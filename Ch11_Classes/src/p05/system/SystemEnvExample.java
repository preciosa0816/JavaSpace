package p05.system;
//Java_Home환경변수 읽기(getenv()) ===다시 읽기
//환경변수 : 운영체제에서 name, value로 관리되는 문자열 정보
public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME"); 
		System.out.println("JAVA_HOME: "+javaHome); //JAVA_HOME의 환경변수 값 출력

	}

}

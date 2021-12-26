package p05.system;

import java.util.Properties;
import java.util.Set;
//system property : JVM이 시작할때 자동설정되는 시스템의 속성값., [key, value]로 구성
public class GetPropertyExample {

	//System.getProperty() : 키 이름을 매개값으로 받고 해당키에대한 값을 문자열로리턴
	public static void main(String[] args) {
		String osName=System.getProperty("os.name");//키 이름을 매개값으로 받고 해당키에대한 값을 문자열로리턴
		String userName=System.getProperty("user.Name");
		String userHome=System.getProperty("user.Home");
		
		System.out.println("운영체제 이름: "+osName);				//개별 속성 읽기
		System.out.println("사용자 이름: "+userName);				//개별 속성 읽기
		System.out.println("사용자 홈디렉토리: "+userHome);		//개별 속성 읽기
		
		System.out.println("-------------------");
		System.out.println("[ key ] value");
		System.out.println("-------------------");
		
		Properties props = System.getProperties();					//모든 속성의 키와 값을 출력
		Set keys = props.keySet();		//Key:나중학습				//모든 속성의 키와 값을 출력
		for(Object objKey : keys) {										//모든 속성의 키와 값을 출력
			String key = (String) objKey;								//모든 속성의 키와 값을 출력
			String value = System.getProperty(key);				//모든 속성의 키와 값을 출력
			System.out.println("[ " +key +"]"+ value);			//모든 속성의 키와 값을 출력
		}
	}

}

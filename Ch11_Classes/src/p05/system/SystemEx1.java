package p05.system;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemEx1 {

	public static void main(String[] args) {
		// 외부에서 1바이트씩 날라오는 것을 2바이트씩 묶어 문자로 인식하겠다
		InputStreamReader r = new InputStreamReader(System.in);
		
		
		try {
			while(true) {
				char c = (char) r.read(); // 숫자가 출력된다.-> character로 변환 //A:65
				System.out.println("입력된 문자: " + c);
				if (c == '.')
					break; //반복문장 탈출				
			}
			
		} catch (IOException e) {
			System.out.println("키보드 입력 Error");
			
		} 
		
		

	}

}

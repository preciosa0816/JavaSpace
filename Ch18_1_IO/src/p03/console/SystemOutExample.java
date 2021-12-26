package p03.console;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		for(byte b=48;b<58;b++)
			os.write(b);//아스키코드 48~57까지 문자 출력
		
		os.write(10);//라인피드(10)을 출력하면 다음 행으로 넘어감
		
		for(byte b=97;b<123;b++)
			os.write(b);//아스키코드 97~122까지 문자 출력
		
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		
		
	}

}

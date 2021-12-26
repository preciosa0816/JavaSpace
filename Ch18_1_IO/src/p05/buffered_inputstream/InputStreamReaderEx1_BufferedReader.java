package p05.buffered_inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//보조스트림: 주스트림이 있어야 한다. 
public class InputStreamReaderEx1_BufferedReader {

	public static void main(String[] args) {
		//내가 한 것
//		String line = null;
//		try {
//			while(true) {
//			//보조스트림
//			InputStreamReader isr = new InputStreamReader(System.in);		
//			//주스트림
//			BufferedReader br = new BufferedReader(isr);
//			System.out.println("사용중인 OS의 인코딩 방식 : "+isr.getEncoding());		
//			System.out.println("문장을 입력하세요. 마치려면 q입력하세요.");
//			
//			line = br.readLine();
//			System.out.println("입력한 문장 : "+line);
//			if(line.equals("q"))  {System.out.println("-종료-");break;}
//			}
//		} catch (IOException e) {
//			
//		}
		
		//수업시간 : do-while 사용하기
		String line = "";
		try {
			// 보조스트림
			InputStreamReader isr = new InputStreamReader(System.in);//InputStreamReader : 문자변환 보조 스트림
			// 주스트림
			BufferedReader br = new BufferedReader(isr);//BufferedReader : 성능향상 보조 스트림
			System.out.println("사용중인 OS의 인코딩 방식 : " + isr.getEncoding());
			do {
				System.out.println("문장을 입력하세요. 마치려면 q입력하세요.");
				line = br.readLine();//문자열을 한번에 읽기가능
				System.out.println("입력한 문장 : " + line);
			} while (!line.equalsIgnoreCase("q"));//대소문자 상관없이 q,Q 입력시 종료
			System.out.println("프로그램을 종료합니다");
		} catch (IOException e) {

		}
	}

}

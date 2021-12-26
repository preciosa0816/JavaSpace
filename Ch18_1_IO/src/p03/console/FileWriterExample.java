package p03.console;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//FileWriter: 텍스트 데이터를 파일에 저장할 때 사용하는 문자 기반 스트림. 
public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true);//기존의 파일 내용 끝에 데이터를 추가하는 경우
		
		fw.write("FileWriter는 한글로 된 "+"\r\n");
		fw.write("문자열을 바로 출력할 수 있다."+"\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}

}

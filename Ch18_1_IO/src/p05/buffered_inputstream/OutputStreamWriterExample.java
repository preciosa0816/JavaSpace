package p05.buffered_inputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
//OutputStreamWriter : 바이트 출력스트림에 연결되어 문자 출력 스트림인 Writer로 변환시키는 보조스트림
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("C:/Temp/file.txt");
		Writer writer = new OutputStreamWriter(fo);
		
		String data="바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
		
	}

}

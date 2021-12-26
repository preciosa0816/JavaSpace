package p05.buffered_inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
//보조스트림은 자체적으로 입출력을 수행할 수 없기 때문에 입력소스와 바로 연결되는 InputStrea, FileInputStream, Reader,
//							FileReader, OutputStream, FileOutputStream,Writer,FileWriter등에 연결해서 입출력 수행

//InputStreamReader : 바이트 기반 스트림에 연결되어 문자 입력 스트림인 Reader로 변환시키는 보조 스트림
public class InputStreamReaderExample {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;	
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=reader.read(cbuf))!=-1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
			
		}
		reader.close();
		
	}

}

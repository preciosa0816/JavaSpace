package p02.char_based.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample3 {
	// 1004p :Reader-read(char[] cbuf,int off, int len) : 메소드는 입력스트림으로부터 len개의 문자만큼
	// 읽고 매개값으로 주어진 문자배열 cbuf[off]부터 len개까지저장한다.
	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] c = new char[4]; // 총 4바이트

		readCharNo = r.read(c, 1, 2);
		for(int i =0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		r.close();
	}

}

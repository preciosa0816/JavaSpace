package p04.fileExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//FileReader: 텍스트파일을 프로그램으로 읽어들일 떄 사용하는 문자기반 스트림
public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/JavaSpace/Ch18_1_IO/src/p04/fileExample/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		fr.close();
		
	}

}

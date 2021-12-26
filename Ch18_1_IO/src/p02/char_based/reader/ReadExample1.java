package p02.char_based.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample1 {
	// 1003p:Reader-read(char[] cbuf) //몇개의 문자를 읽었는지 
	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[]c=new char[2]; //총 4바이트
		String data = "";
		while (true) {
			readCharNo = r.read(c);
			if (readCharNo == -1)
				break;			
			data=data+new String(c,0,readCharNo);
			
		}System.out.println(data);
		
		r.close();
	}

}

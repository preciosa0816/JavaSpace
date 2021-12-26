package p02.char_based.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample2 {
	// 1002p - Reader- read()
	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("C:/Temp/test.txt");
		int readData;
		
		while (true) {
			readData = r.read();
			if (readData == -1)
				break;
			char ch = (char) readData;
			System.out.println(ch);
		}
		r.close();
	}

}

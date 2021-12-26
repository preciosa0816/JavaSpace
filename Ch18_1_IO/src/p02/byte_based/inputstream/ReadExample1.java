package p02.byte_based.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
//996: input stream 의 readmethod
public class ReadExample1 {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/p02/byte_based/inputstream/test2.dat");
			int readByte;
			while (true) {
				//코드숫자 = 코드 문자(바이트)
				readByte = is.read();
				if (readByte == -1)
					break;
				System.out.println(readByte);
				char ch = (char) readByte;
				System.out.println(ch);
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		try {
			is.close();
		} catch (IOException e) {

		}
	}

}

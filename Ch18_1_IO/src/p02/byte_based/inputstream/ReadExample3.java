package p02.byte_based.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//998: input stream 의 read(byte[]b) method
public class ReadExample3 {

	public static void main(String[] args) {
		InputStream is = null;
		int readByteNo;
		try {
			is = new FileInputStream("src/p02/byte_based/inputstream/test2.dat");		
			byte[] readBytes = new byte[8];
			readByteNo = is.read(readBytes,2,3); //2번인덱스부터 시작해서 길이가 3인 배열의 내용 출력
			for(int i=0;i<readBytes.length;i++) {
				System.out.println(readBytes[i]);
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

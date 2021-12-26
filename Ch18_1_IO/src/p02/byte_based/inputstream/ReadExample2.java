package p02.byte_based.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//998: input stream 의 read(byte[]b) method
public class ReadExample2 {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/p02/byte_based/inputstream/test2.dat");
			int readByteNo;
			byte[] readBytes = new byte[3];
			String data="";
			while (true) {
				readByteNo = is.read(readBytes);
				if (readByteNo == -1)
					break;
				System.out.println(readBytes);
				//byte[] b, int off, int len : len 만큼의 바이트만큼 읽고 매개값으로 주어진바이트 배열 b[0ff]부터 len개까지 작성		
				data = data+new String(readBytes,0,readByteNo);
//				for (int i = 0; i < readBytes.length; i++) {
//					System.out.println(readBytes[i]);
//				} //내가 한 것
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		try {
			is.close();
		} catch (IOException e) {

		}
	}

}

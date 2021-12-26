package p02.byte_based.inputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//1001- outputStream-write(byte[] b)
public class WriteExample2 {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("test.txt");
			// new String("ABC")
			byte[] b = "ABCD".getBytes();
			
				os.write(b);
			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		// 반드시 수행할 내용
		try {
			os.flush();// buffer에 들어있는 내용 출력
			os.close();
		} catch (IOException e) {

		}

	}
}

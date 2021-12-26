package p02.byte_based.inputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//1000- outputStream-write(int b)
public class WriteExample1 {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/Temp/test.txt");
			// new String("ABC")
			byte[] b = "ABC".getBytes();
			for (int i = 0; i < b.length; i++) {
				os.write(b[i]);
			}
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

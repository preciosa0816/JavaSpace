package p02.byte_based.inputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//1001- outputStream-write(byte[] b, int off, int len)
public class WriteExample3 {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/Temp/test.txt");
			// new String("ABC")
			byte[] b = "ABC".getBytes();
			
				os.write(b,1,2); //BC
			//	os.write(b,1,1); //B
			
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

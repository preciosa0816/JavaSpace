package p02.byte_based.inputstream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream("output.dat"); // dat:알 수 없는 확장자 이름
			byte[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			for (int i = 0; i < b.length; i++)
				fo.write(b[i]);

		} catch (FileNotFoundException e) {
			System.out.println("파일로 출력할 수 없습니다");
		} catch (IOException e) {
			System.out.println("입출력에 문제 있습니다.");
		}

		try {
			fo.close();
		} catch (IOException e) {

		}

		
	}

}

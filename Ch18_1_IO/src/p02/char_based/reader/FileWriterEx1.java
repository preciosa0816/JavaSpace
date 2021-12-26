package p02.char_based.reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
//문자기반(Character_based):문자(2bytes)단위 이동하고 처리
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("maven.txt");
			char c[] = { 's', 'p', 'r', 'i', 'n', 'g' };
			for (int i = 0; i < c.length; i++) {
				fw.write(c[i]);

			}
		} catch (IOException e) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		try {
			fw.close();
		} catch (IOException e) {

		}
		
		

	}

}

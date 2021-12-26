package p01.basic2.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		FileReader f=null;
		try {
			f = new FileReader("some.txt"); //Checked Exception

		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 없습니다.");

		} catch (IOException e) {
			System.out.println("입출력을 할 수 없습니다.");
			
		} catch (Exception e) {
			System.out.println("일반적인 예외입니다.");			
		}		
		System.out.println("Done");
		try {
			f.close(); //Checked Exception
		} catch (IOException e) {
			
		}
	}

}

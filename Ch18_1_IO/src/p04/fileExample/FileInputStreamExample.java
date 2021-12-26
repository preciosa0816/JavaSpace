package p04.fileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
//FileInputStream : 파일로부터 바이트 단위로 읽어들일 때 사용하는 바이트 기반 입력 스트림,모든종류의 파일 읽기 가능
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:/JavaSpace/Ch18_1_IO/src/p04/fileExample/FileInputStreamExample.java");
			int data;
			
			while((data=fis.read())!=-1) {//1byte씩 잃고 콘솔에 출력
				System.out.write(data); //**주목**
			}
			fis.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

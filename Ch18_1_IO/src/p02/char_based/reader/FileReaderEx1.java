package p02.char_based.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			//fr=new FileReader("maven.txt") // 상대경로 :1개의 프로젝트부터 시작
			fr = new FileReader("src/p02/char_based/reader/maven.txt");//상대경로
			
			//절대경로:시스템환경변경시 에러, C or D 드라이브부터 
			//fr = new FileReader("C:\\JavaSpace\\Ch18_1_IO\\src\\p02\\char_based\\reader\\maven.txt"); 
			while (true) {
				int data = fr.read(); //data는 int 타입임
				if(data==-1) //파일의 끝
					break;
				char ch =(char) data; //int타입인 데이터를 바꾸기
				System.out.print(ch);
				System.out.println(data);
				}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 없습니다.");

		} catch (IOException e) {
			System.out.println("입출력에 문제가 발생했습니다.");
		}
		
		try {
			fr.close();
		} catch (IOException e) {
			
		}
	}

}

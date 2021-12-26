package p04.fileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//그림 파일을 복사해서 다른 폴더 안에 저장하기 
//FileOutputStream:바이트 단위로 저장하기 때문에 모든 종류의 데이터를 파일로 저장 가능
public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		String originalFileName = "C:/JavaSpace/Ch18_1_IO/src/p04/fileExample/house.jpg";
		String targetFileName="C:/Temp/house.jpg";//복사할 폴더와 파일명
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		//FileOutputStream fos = new FileOutputStream(file, true); // 파일을 엎어쓰지 않고 끝에 데이터 추가하는 경우
		
		int readByteNo;//실제로 읽은 바이트수가 저장될 변수
		byte[] readBytes = new byte[100];//바이트 배열을 한번에 저장하기 위해(100바이트씩 나눠 저장)
		while((readByteNo=fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}

}

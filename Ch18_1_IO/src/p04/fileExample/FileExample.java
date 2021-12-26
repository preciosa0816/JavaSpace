package p04.fileExample;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
//File클래스는 파일 크기, 파일 속성, 파일 이름 등의 정보를 얻어내는 기능과 파일 생성 및 삭제 기능 제공, 디렉토리 생성, 파일리스트 얻기 기능
	//파일의 데이터 읽고 쓰기 기능 x
	public static void main(String[] args) throws URISyntaxException, IOException {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt")); //파일경로 URI객체로 생성해서 매개값으로 제공
		
		if(dir.exists()==false) {dir.mkdir();}//경로 상에 없는 디렉토리를 생성
		if(file1.exists()==false) {file1.createNewFile();}//새로운 파일 생성
		if(file2.exists()==false) {file2.createNewFile();}
		if(file3.exists()==false) {file3.createNewFile();}
		
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents=temp.listFiles();//디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 FIle 배열로 리턴
		
		System.out.println("\t날짜 \t\t시간 \t\t 형태\t\t 크기   \t\t이름");
		System.out.println("----------------------------------------------------------------------");

		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));//마지막 수정 날짜 및 시간을 리턴
			if(file.isDirectory()) {//디렉토리인지 여부
				System.out.print("\t<DIR>\t\t\t"+file.getName());
			}else {
				System.out.print("\t\t\t   "+file.length()+"\t\t"+file.getName());
			}
			System.out.println();
			
		}
		
	}

}

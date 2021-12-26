package p02.byte_based.inputstream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;


import java.io.IOException;

public class FileOutputStreamEx1 {

	public static void main(String[] args) {
		// 저장: 현재패키지 안에 "fileoutput.txt"로 저장
		// 내용: String msg="FileOutputStream Test"

		FileOutputStream os = null;
		String msg = "FileOutputStream Test";
		byte[] b = msg.getBytes();
		

		try {
			os = new FileOutputStream("fileoutput.txt");
			os.write(b);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 생성할 수 없습니다.");
		} catch (IOException e) {
			System.out.println("내용을 작성할 수 없습니다.");
		}


//		 파일리더로 혼자해본 것
//		FileReader fr = null;
//		try {
//			fr = new FileReader("fileoutput.txt");
//			while (true) {
//				int data = fr.read(); // data는 int 타입임
//				if (data == -1) // 파일의 끝
//					break;
//				char ch = (char) data; // int타입인 데이터를 바꾸기
//				System.out.print(ch);
//				// System.out.println(data);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("해당 파일이 없습니다.");
//
//		} catch (IOException e) {
//			System.out.println("입출력에 문제가 발생했습니다.");
//		}

	}

}

package p05.buffered_inputstream.object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ObjectInputStreamEx2 {

	public static void main(String[] args) {
		//역직렬화
		// 주스트림/ 보조스트림
		ObjectInputStream oi = null;
		try {
			FileInputStream is = new FileInputStream("obj2.dat");
			oi = new ObjectInputStream(is);
			while(true) {
			GoodStock gs = (GoodStock) oi.readObject();
			System.out.println(gs.code+" : "+gs.num);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch (EOFException e) { // End of File
			System.out.println("THE END");
		}catch (FileNotFoundException e) {
			System.out.println("해당 클래스가 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다."); 
		}
		
		try {
			oi.close();
		} catch (IOException e) {
			
		}
	}

}

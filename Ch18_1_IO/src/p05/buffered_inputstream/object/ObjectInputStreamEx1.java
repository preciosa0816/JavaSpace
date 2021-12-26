package p05.buffered_inputstream.object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputStreamEx1 {

	public static void main(String[] args) {
		//역직렬화
		// 주스트림/ 보조스트림
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("obj.dat"));
			while (true) {
				GregorianCalendar ob = (GregorianCalendar) ois.readObject();
				int year = ob.get(Calendar.YEAR);
				int month = ob.get(Calendar.MONTH);
				int date = ob.get(Calendar.DATE);
				System.out.println(year + "/" + month + "/" + date);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 없습니다.");
		}catch (EOFException e) { // End of File
			System.out.println("THE END");
		}catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다."); 
		}
		try {
			ois.close();
		} catch (IOException e) {

		}
	}

}

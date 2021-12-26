package p05.buffered_inputstream.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputStreamEx1 {
	//직렬화
//objectOutputStream/objectInputStream : 기본형타입과 참조형타입의 데이터를 입출력하는 클래스
//보조스트림 
	public static void main(String[] args) {
		ObjectOutputStream ot = null;
		try {

			FileOutputStream fo = new FileOutputStream("obj.dat");

			ot = new ObjectOutputStream(fo);
			ot.writeObject(new GregorianCalendar(2019, 07, 6));
			ot.writeObject(new GregorianCalendar(2019, 07, 7));
			ot.writeObject(new GregorianCalendar(2019, 07, 8));
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		try {
			ot.close();
		} catch (IOException e) {

		}
	}

}

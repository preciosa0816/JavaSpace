package p05.buffered_inputstream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		DataInputStream dis = null;
		try {
			FileInputStream is = new FileInputStream("dataOutput.dat");
			dis = new DataInputStream(is);
			while (true) {
				int line = dis.readInt();
				System.out.print(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (EOFException e) { // End of File
			System.out.println("THE END");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수가 없습니다.");
		} finally {
			try {
				dis.close();
			} catch (IOException e) {

			}
		}

	}

}

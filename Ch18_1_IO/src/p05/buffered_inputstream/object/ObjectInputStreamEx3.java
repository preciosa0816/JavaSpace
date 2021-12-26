package p05.buffered_inputstream.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamEx3 {

	public static void main(String[] args) {
		// 역직렬화
		// 주스트림/ 보조스트림
		ObjectInputStream os = null;
		BBSItem bi;
		try {
			FileInputStream fo = new FileInputStream("obj3.dat");
			os = new ObjectInputStream(fo);

			bi = (BBSItem) os.readObject();

			System.out.println("전체 게시물 수 : " + bi.itemNum);//출력불가
			System.out.println("글쓴이 : " + bi.writer);
			System.out.println("PW : " + bi.password);//출력불가
			System.out.println("제목 : " + bi.title);
			System.out.println("내용 : " + bi.content);
			
		} catch (ClassNotFoundException e) {

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

		try {
			os.close();
		} catch (IOException e) {

		}

	}

}

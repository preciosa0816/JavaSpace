package p05.buffered_inputstream.object;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//직렬화
public class ObjectOutputStreamEx2 {

	public static void main(String[] args) {
		// "1111",100
		// "2222",30
		// "3333",70
		ObjectOutputStream os = null;
		try {
			FileOutputStream fo = new FileOutputStream("obj2.dat");
			os = new ObjectOutputStream(fo);
			os.writeObject(new GoodStock("1111", 100));
			os.writeObject(new GoodStock("2222", 30));
			os.writeObject(new GoodStock("3333", 70));

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

		try {
			os.close();
		} catch (IOException e) {

		}


	}

}

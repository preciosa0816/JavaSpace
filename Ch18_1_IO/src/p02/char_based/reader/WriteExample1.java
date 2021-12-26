package p02.char_based.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {
//1005:Writer-write(int c)
	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("C:/Temp/test.txt");
		char[] c = "홍길동".toCharArray();
		for (int i = 0; i < c.length; i++)
			w.write(c[i]);
		
		w.flush();
		w.close();
	}

}

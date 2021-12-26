package p02.char_based.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample3 {
//1007:Writer-write(char[] c, int off, int len)
	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("C:/Temp/test.txt");
		char[] c = "홍길동2".toCharArray();
		w.write(c,1,2);//"길동"
		w.flush();
		w.close();
	}

}

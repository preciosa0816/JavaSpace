package p05.buffered_inputstream.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableReader {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1: "+v.field1);
		System.out.println("field2.field1: "+v.field2.field1);
		System.out.println("field3: "+v.field3); //값이 없음 - 직렬화 불가
		System.out.println("field4: "+v.field4); //값이 없음 - 직렬화 불가
		
	}

}

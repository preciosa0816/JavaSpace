package p05.buffered_inputstream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//보조 스트림 : DataOutputStream/DataInputStream : primitive(기본형)타입의 데이터를 입출력 하는 클래스
//DataOutputStream : 기본타입의 데이터를 ByteStream으로 만들어서 출력하는 기능의 클래스
public class DataOutputEx1 {
	
	public static void main(String[] args) {
		FileOutputStream fo = null;
		DataOutputStream dos=null;
//		String str1=null;
//		String str2="";
		
		try {
			fo = new FileOutputStream("dataOutput.dat");
			dos = new DataOutputStream(fo);
			int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			for (int i = 0; i < arr.length; i++)
				dos.writeInt(arr[i]);

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

	}
}

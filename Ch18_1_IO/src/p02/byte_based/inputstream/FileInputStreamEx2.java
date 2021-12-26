package p02.byte_based.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		
		FileInputStream fo=null;
		try {
			fo = new FileInputStream(args[0]); //run as-configuration에 "output.dat" 넣음
			byte[] b = new byte[11];
			while (true) {
				int num = fo.read(b);
				if(num<0) break; //값이 없을때(저장이 안되어있을때)
				for(int i=0;i<b.length;i++) {
					System.out.println(b[i]);				
				} System.out.println();
			}
		} catch (FileNotFoundException e1) {

		} catch (IOException e) {

		}
		try {
			fo.close();
		} catch (IOException e) {
			
		}
		

		System.out.println("----------내가한것---------");
		FileInputStream io = null;
		try {
			io = new FileInputStream("output.dat");
			while (true) {
				int data = io.read();
				if (data == -1)
					break;
				System.out.println(data);
			}

		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

		try {
			io.close();
		} catch (IOException e) {
		}

	}

}

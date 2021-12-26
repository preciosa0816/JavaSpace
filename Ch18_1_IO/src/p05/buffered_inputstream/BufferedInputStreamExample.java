package p05.buffered_inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws IOException {
		long start =0;
		long end=0;
		
		FileInputStream fis1 = new FileInputStream("C:/JavaSpace/Ch18_1_IO/src/p05/buffered_inputstream/tomato.jpg");

		start = System.currentTimeMillis();
		while(fis1.read()!=-1) {}
			end=System.currentTimeMillis();
			System.out.println("사용 하지 않았을 때 :"+(end-start)+"ms");
			fis1.close();
			
			FileInputStream fis2=  new FileInputStream("C:/JavaSpace/Ch18_1_IO/src/p05/buffered_inputstream/tomato.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis2);
			start= System.currentTimeMillis();
			while(bis.read()!=-1) {}
				end=System.currentTimeMillis();
				System.out.println("사용 했을 때 :"+(end-start)+"ms"); //버퍼스트림 사용시 속도가 향상된 것을 볼 수있음
				bis.close();
				fis2.close();
			
		
		
		}
		
	}



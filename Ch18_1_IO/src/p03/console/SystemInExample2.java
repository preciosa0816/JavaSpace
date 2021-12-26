package p03.console;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		byte[] datas= new byte[100];
		
		System.out.print("이름: ");
		int nameBytes = is.read(datas);
		//끝의 2바이트는 Enter키에 해당하는 캐리지리턴(13)과 라인피드(10)이므로 문자열에서 제외시킴
		String name = new String(datas,0,nameBytes-2); 		
		System.out.print("하고 싶은 말: ");
		int commentBytes = is.read(datas);
		//끝의 2바이트는 Enter키에 해당하는 캐리지리턴(13)과 라인피드(10)이므로 문자열에서 제외시킴
		String coment = new String(datas,0,commentBytes-2);
		
		System.out.println("입력한 이름: "+name);
		System.out.println("입력한 하고 싶은말: "+coment);
		
		
	}

}

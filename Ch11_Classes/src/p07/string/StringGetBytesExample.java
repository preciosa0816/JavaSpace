package p07.string;

import java.io.UnsupportedEncodingException;
//문자열을 바이트배열로 변환, 어떤 문자셋으로 인코딩하느냐에 따라 바이트 배열의 크기가 달라짐
public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		//기본 문자셋으로 인코딩과 디코딩
		byte[] bytes1= str.getBytes();
		System.out.println("bytes1.length: "+bytes1.length); //15?? 원래는 10이어야함
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: "+str1);
		
		
		try {
			//EUC-KR을 이용해서 인코딩과 디코딩 : 알파벳은 1바이트, 한글은 2바이트
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: "+bytes2.length);
			String str2 =new String(bytes2,"EUC-KR");
			System.out.println("bytes2->String: "+str2);
			
			//UTF-8을 이용해서 인코딩과 디코딩:알파벳 1바이트, 한글 3바이트
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: "+bytes3.length);
			String str3 =new String(bytes3,"UTF-8");
			System.out.println("bytes3->String: "+str3);
			
			
			
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		
	}

}

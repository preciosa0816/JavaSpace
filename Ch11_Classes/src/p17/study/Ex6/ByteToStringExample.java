package p17.study.Ex6;
//***************************************** 497p참고
public class ByteToStringExample {

	public static void main(String[] args) {
		// 바이트 배열을 문자로 변환시키기
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 }; //127이 넘어가는 내용이 없다
		
		String k[] = new String[bytes.length];
		String result="";
		for(int i=0;i<bytes.length;i++) {
			k[i]=String.valueOf(bytes[i]);
			result +=(k[i]+", ");
		}

		String str = result;
		System.out.println(str);
		
		String str2 = new String(bytes); //책참고하기
		System.out.println(str2);
		
		
	}
	
	

}

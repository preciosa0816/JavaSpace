package p02.datatype;
//40
//data : 
//Data Type : data의 종류에 따라 값이 저장될 공간의 크기와 저장형식을 정의한 것.
//			(1)Primitive Type (기본형타입): Ch3
//			(2)Reference Type(참조타입) : Ch5



public class ByteExample {

	public static void main(String[] args) {
	
		// 1. 정수형
		
		byte var1 = -128; //1byte : -128~127
		
		short sh1 = 32767; //2byte : -32368~32767
		
		//default(기본값) : 
		
		int k = 300; //4byte : -2,147,483,648~2,147,483,647(21억)
		
		long lo = 5000000000000000L; // 기본적으로 int이기 때문에 21억이상일때 L을 안 넣으면 error! 
													//8byte 
		
		//byte var2 = -30;
		//byte var3 = 0;
		//byte var4 = 30;
		//byte var5 = 127;
		//byte var6 = 128; //컴파일 에러 , 표현 범위 벗어남
		
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		//2. 문자형
		
		char c='A'; //2byte : 0~65,535
		System.out.println(c);
		
		//Promotion(자동형변환) : 작은타입에서 큰타입으로 형변환
		int c_int = c;
		System.out.println(c_int); //ASCII
		
		char c2 = (char) 66000; //억지로넣으면 데이터 짤림 66000->464
		System.out.println(c2); //Casting(강제형변환) : 큰타입에서 작은타입으로 형변환
		
		
		//System.out.println(var1);
		//System.out.println(var2);
		//System.out.println(var3);
		//System.out.println(var4);
		//System.out.println(var5);	

	}

}

package p04.class_local;

public class UsingLocalVariable {
	void method(int arg) {//arg는 final 특성을 가짐
		int localVar = 40;//localVar는 final특성을 가짐
		
		//arg=31; //final속성때문에 수정불가
		//localVar=41; //final속성때문에 수정불가
		
		//람다식
		MyfunctionalInterface fi = ()-> {
				// 로컬 변수 읽기
				System.out.println("arg: "+arg);
				System.out.println("localVar: "+localVar+"\n");
				
		};
		
		fi.mothod();
		
	}
}

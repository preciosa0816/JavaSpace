package p07.polymorphism.array;

public class ArrayMethod_Main {
//배열의 다형성
	public static void main(String[] args) {
//		int arrr [] = new int[2];//
		ArrayMethod[] am = new ArrayMethod[2]; //배열생성
		
		am[0]=new ArrayMethodA();
		am[1]=new ArrayMethodB();
		
		
		//showSleepStyle() 출력하기
		for (int i=0;i<am.length;i++) {
			am[i].showSleepStyle();
		}
		
		//향상된 for문
		
		for(ArrayMethod k:am) {
			k.showSleepStyle();
		}
	}

}

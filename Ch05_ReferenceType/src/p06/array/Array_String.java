package p06.array;


public class Array_String {

	public static void main(String[] args) {
		// 배열 생성 방법 3가지
		String str =new String("홍길동");//객체생성
		String st="홍길동";					 // 위랑 같은 형태임
		//1
		String str1[]= {"홍길동","알파고","베타고"};
		System.out.println(str1[0]);
		
		//2
		String str2[]= new String[]{"홍길동2","알파고2","베타고2"};//배열생성
		
		//3
		String str3[]= new String[3];
		str3[0]="홍길동3";
		str3[1]=new String("알파고3"); //만약 내가 클래스를 만든다면 이 방법을 써야함
		str3[2]=new String("베타고3");
		
		for (int i=0; i<str1.length; i++) {
			System.out.println(str3[i]);
		}
		
		for (String s:str3) {			
			System.out.println(s);
		}
			
	}

}

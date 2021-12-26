package p03.object.hashcode;
//hashcode():key값을 분석해서 숫자로 변환하는 메소드
public class KeyExample {

	public static void main(String[] args) {
		// 1. 자바 개발자가 만든 클래스인 경우
		String str1 = new String("알파고");
		String str2 = new String("알파고");
		
		int hash1 = str1.hashCode();
		int hash2 = str2.hashCode();
		
		System.out.println(hash1); //50257312
		System.out.println(hash2); //50257312 같은 숫자 출력됨
		
		if (hash1==hash2) {
			System.out.println("hash1 : "+hash1+" = " +"hash2 : "+hash2);
		}
		
		System.out.println(str1.equals(str2));
		

	}

}

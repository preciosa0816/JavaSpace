package p03.object.hashcode;

import java.util.HashMap;

public class KeyExample_book {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 hashMap 객체 생성
		HashMap<Key, String> hashmap = new HashMap<Key, String>();
		
		//식별 키 "new Key(1)"으로 "홍길동"을 저장함
		hashmap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)"로 "홍길동"을 읽어옴
		String value = hashmap.get(new Key(1)); // hashcode를 재정의 전에는 null값 출력.
		System.out.println(value);
		

	}

}

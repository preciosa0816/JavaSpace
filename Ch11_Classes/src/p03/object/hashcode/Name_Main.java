package p03.object.hashcode;

import java.util.HashMap;

//hashcode()
public class Name_Main {

	public static void main(String[] args) {

		HashMap<Name, Integer> h = new HashMap<Name, Integer>();
		h.put(new Name("Harry", "potter"), new Integer(100));
		h.put(new Name("Hong", "Kildong"), 80);
		h.put(new Name("Alpha", "Go"), 70);

		// 홍길동의 점수 출력
		Integer jum = h.get(new Name("Hong", "Kildong"));
		System.out.println(jum);// null :// hashcode와 equal 재정의후 Key값인 80 출력됨

		Name n1 = new Name("홍", "길동");
		Name n2 = new Name("홍", "길동");

		int hash_n1 = n1.hashCode();//재정의
		int hash_n2 = n2.hashCode();
		System.out.println(hash_n1); // 해쉬코드 비교
		System.out.println(hash_n2); // 내용이 같아도 해쉬코드는 다름. //hashcode재정의후 같은 값 출력
		
		System.out.println("equal 확인하기"); 
		if(n1.equals(n2))
			System.out.println("같음"); //equal 재정의 후 출력값
		else
			System.out.println("다름"); //equal 재정의 전 출력값

		System.out.println();

		// 2. 자바 개발자 코드 : 자동으로 hashcode()적용
		HashMap<String, Integer> h2 = new HashMap<String, Integer>();
		h2.put(new String("HongKildong"), 90);
		h2.put("AlphaGo", new Integer(80));
		h2.put(new String("BetaGo"), 70);

		Integer jum2 = h2.get("HongKildong"); // 90이라는 값이 나옴
		System.out.println(jum2);

		// hashcode
		
		int hash2 = h2.hashCode();
		System.out.println(hash2);

	}

}

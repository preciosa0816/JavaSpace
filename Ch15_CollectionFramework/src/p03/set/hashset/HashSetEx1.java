package p03.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
//Set 계열 : 자료를 주머니속에 저장, 중복불가, 순서없음
//				Iterable-collection-Set-HashSet/TreeSet

public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>(); 
		hs.add("abc");
		hs.add(new String("abc"));//개발자가 만든 클래스는 데이터 중복x
		hs.add(new Person("홍길동", 10));
		hs.add(new Person("홍길동", 10)); // 내가 만든클래스는 중복되어 출력됨 왜? 재정의 필요함
		
		System.out.println(hs);
		
		Iterator<Object> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

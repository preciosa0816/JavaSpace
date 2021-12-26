package p04.map.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//HashTable : Map계열(key,value), 동기화된 메소드(멀티스레드가 동시에 이 메소드들 실행 불가), 안전한 객체의 추가/삭제
public class HashTableEx {

	public static void main(String[] args) {
		
		Map<String,String> ht = new Hashtable<>(); //인터페이스의 눈으로 생성된 자식을 봄
		
		ht.put("Grapes", "포도");
		ht.put("Apple", "사과");
		ht.put("Orange", "오렌지");
		ht.put("Grapes", "포도");		
		System.out.println("Hashtable의 키의 수 : " +ht.size() );
		
		System.out.println("keySet() : "+ht.keySet());
		Set<String>s = ht.keySet();
		Iterator<String>it=s.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = ht.get(key);
			System.out.println(key+":"+value);
		}
		
		System.out.println();
		//
		Hashtable<String, String> hs = new Hashtable<>(); 
		
		hs.put("Grapes", "포도");
		hs.put("Apple", "사과");
		hs.put("Orange", "오렌지");
		hs.put("Grapes", "포도");		
		System.out.println("Hashtable의 키의 수 : " +hs.size() );
		
		Enumeration<String> table=hs.keys();		
		while(table.hasMoreElements()) {
			String key=table.nextElement();
			String value = hs.get(key);
			System.out.println(key+"::"+value);
		}
		System.out.println();
		
		Enumeration<String> table2=((Hashtable<String, String>) ht).keys();		
		System.out.println("----강제 형변환 후 출력----");
		while(table2.hasMoreElements()) {
			String key=table2.nextElement();
			String value = ht.get(key);
			System.out.println(key+":::"+value);
		}
	}
	
	

}

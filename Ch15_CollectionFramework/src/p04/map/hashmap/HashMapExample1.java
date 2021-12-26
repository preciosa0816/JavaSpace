package p04.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Map : 자료가 key, value쌍으로 되어있을 경우 사용
//			Map-NavigableMap-Hashtable/HashMap,properties, TreeMap
public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("알파고", 85);
		m.put("홍길동", 95);
		m.put("베타고", 80);
		m.put("홍길동", 85); // Key가 같을 경우 마지막 value가 저장됨

		System.out.println("총 Entry 수 : " + m.size()); // 3(키값이 같은 엔트리가 있기 때문)

		// HashMap출력1 : keySet()을 통한 출력
		Set<String> ks = m.keySet();
		Iterator<String> it = ks.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Integer value = m.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();

		// HashMap출력2 : entrySet()을 통한 출력
		Set<Map.Entry<String, Integer>> ks2 = m.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = ks2.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Integer> entry = it2.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			//System.out.println(entry);//출력시 (key=value)형식으로 출력됨
			System.out.println(key + " : " + value);
		}
		System.out.println();
		//객체 삭제
		m.remove("알파고");
		System.out.println("총 Entry 수  : "+m.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer> >entrySet = m.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator =entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("\t"+key+" : "+value);
			
		}
		System.out.println();
		
		//객체 전체 삭제
		m.clear();
		System.out.println("총 Entry 수 : "+m.size());
	
	}

}

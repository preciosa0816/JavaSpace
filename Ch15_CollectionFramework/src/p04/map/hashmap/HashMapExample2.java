package p04.map.hashmap;

import java.util.HashMap;
import java.util.Map;


//Map 계열  : 자료가 Key와 Value쌍으로 되어있는 상태일때 사용
//			하위클래스 : HashMap, TreeMap, Hashtable, Properties
//Hashtable : 구버전(동기화)
//HashMap : 신버전(비동기화)
public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> m= new HashMap<>();
		m.put(new Student(1, "홍길동"), 95);
		m.put(new Student(1, "홍길동"), 5);

		System.out.println(m);
		
		System.out.println("총 Entry 수: "+m.size());
		
	}

}

package p04.map.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample1 {
//TreeMap : Map계열(key, value), -검색기능 // 자동오름차순 정렬
	public static void main(String[] args) {
		//이진트리만들기 
		TreeMap<Integer, String> s = new TreeMap<>();
		s.put(87, "홍길동"); //부모노드 
		s.put(new Integer(98), new String("홍길동2"));
		s.put(new Integer(75), new String("홍길동3"));
		s.put(new Integer(95), new String("홍길동4"));
		s.put(new Integer(80), new String("홍길동5"));
		
		//1.자동정렬됨
		System.out.println(s);
		System.out.println();
		
		//2.내림차순(descending sort)
		NavigableMap<Integer, String> dm = s.descendingMap();
		Set<Entry<Integer, String>> ds=dm.entrySet();
		for(Entry<Integer, String> entry : ds) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		System.out.println("-------------");
		//3.내림차순(descending sort 역)
		NavigableMap<Integer, String> am = dm.descendingMap();
		Set<Entry<Integer, String>> as=am.entrySet();
		for(Entry<Integer, String> entry : as) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		System.out.println();
		Entry<Integer, String>e1=null;
		e1=s.firstEntry();
		Integer e1key = e1.getKey();
		String e1value = e1.getValue();
		System.out.println("가장 작은 점수: "+e1key+"-"+e1value);
		
		e1=s.lowerEntry(95);
		System.out.println("95 바로아래 점수: "+e1.getKey()+"-"+e1.getValue());
		
		e1=s.ceilingEntry(80);
		System.out.println("80 이거나 바로 위 점수 : " +e1.getKey()+"-"+e1.getValue());
		
		e1=s.floorEntry(92);
		System.out.println("92 이거나 바로 아래 점수 : "+e1.getKey()+"-"+e1.getValue());
		
		//lowerEntry(): ()위의 점수
		//highterEntry():()아래 점수
		System.out.println();
		System.out.println("-------높은 점수부터 차례로 제거하기--------");
		Map.Entry<Integer, String> entry=null;
		while(!s.isEmpty()) {
			entry=s.pollLastEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+"(남은 객체 수: "+s.size()+")");
		}
		
	}

}

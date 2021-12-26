package p03.set.treeset;
import java.util.NavigableSet;

import java.util.TreeSet;
//TreeSet : search 기능
public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(87);
		ts.add(new Integer(98));
		ts.add(new Integer(75));
		ts.add(new Integer(95));
		ts.add(new Integer(80));
		
		//1. 자동 오름차순 정렬
		System.out.println(ts);//자동 오름차순
		System.out.println("가장 낮은 점수 :"+ ts.first()); //first():제일 낮은 객체 리턴
		System.out.println("가장 높은 점수 :"+ ts.last());//last():제일 높은 객체 리턴
		System.out.println("95점 아래 점수 :"+ ts.lower(95));//lower(num) num 바로 아래 객체 리턴
		System.out.println("95점 위 점수 :"+ ts.higher(95));//higher(num) num 바로 위 객체 리턴
		System.out.println("95점이거나 바로 아래 점수 :"+ ts.floor(95)); // floor():()안에 숫자 포함 아래객체
		System.out.println("85점이거나 바로 위의 점수 : "+ts.ceiling(85));//ceiling():()안 숫자포함 위객체
		System.out.println();
		
		//2.내림차순 정렬
		NavigableSet<Integer> ns= ts.descendingSet();
		System.out.println(ns);
	
		for(Integer s : ns) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//3.내림차순 정렬 다시한번 =>오름차순
		NavigableSet<Integer> as= ns.descendingSet();
		System.out.println(as);
		
		for(Integer s : as) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println();
		Integer score=null;
		while(!ts.isEmpty()) {
			score = ts.pollFirst();//pollFirst():제일 낮은 객체를 꺼내오고 컬렉션에서 제거함<->poolLast()
			System.out.println(ts);
			System.out.println("남은 객체 수: "+ts.size());
			
		}
	}

}

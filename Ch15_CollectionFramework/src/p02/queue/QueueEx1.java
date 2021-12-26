package p02.queue;
//Queue: Iterable-Collection-Queue 인터페이스
//인터페이스이므로 구현: LinkedList
import java.util.LinkedList;

import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("Java");
		q.add(new String("Spring"));
		q.add(new String("Python"));
		System.out.println(q);
//		while(!q.isEmpty()) { //poll() : 출력및 제거
//			System.out.println(q.poll());
//		}
		
		while(!q.isEmpty()) {//remove() : 출력및 제거
			System.out.println(q.remove());
		}
		System.out.println(q);
		
		
		
		
	}
	

}

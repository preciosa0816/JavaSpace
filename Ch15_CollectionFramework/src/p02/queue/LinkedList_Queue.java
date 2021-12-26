package p02.queue;

import java.util.LinkedList;
//LinkedList를 이용한 Queue 구현
//List 계열
//Queue : First In First Out
public class LinkedList_Queue {

	public static void main(String[] args) {
		LinkedList<String> q = new LinkedList<String>();
		q.offer("토끼");
		q.offer(new String("토끼"));
		q.offer(new String("호랑이"));
		
		while(!q.isEmpty()) {
//			String name = q.peek(); //무한반복
//			System.out.println(name);
			String name = q.poll();
			//poll() : 출력및 제거
			System.out.println(name);
			System.out.println(q);
		}
		
	}

}

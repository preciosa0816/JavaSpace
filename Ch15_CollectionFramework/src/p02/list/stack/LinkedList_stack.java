package p02.list.stack;

import java.util.LinkedList;
//LinkedList이용해서 Stack 구현하기
public class LinkedList_stack {

	public static void main(String[] args) {
		LinkedList<Integer> s = new LinkedList<Integer>();
		//12,59,7 stack에 저장하기
		s.addLast(new Integer(12)); 
		s.addLast(new Integer(59));
		s.addLast(new Integer(7));		
		System.out.println(s);
		while(!s.isEmpty()) {
			Integer num = s.removeLast();//마지막 요소를 꺼내면서 삭제
			System.out.println(num);
			System.out.println(s);
		}
		
		

		
		}
	}



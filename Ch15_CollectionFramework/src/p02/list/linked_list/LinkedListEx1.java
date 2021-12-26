package p02.list.linked_list;

import java.util.LinkedList;

//List 계열
//LinkedList : 삽입 ,삭제가 많은 작업시 유리(작업변경이 많은 경우)
//ArrayList : 자료의 변화가 적은 경우 유리
public class LinkedListEx1 {

	public static void main(String[] args) {
		//LinkedList<E> E에 기본형타입을 넣을 수 없음
		LinkedList<Character> list = new LinkedList<Character>();
		list.add('a');
		list.add(new Character('b')); // 원래 식
		list.add(new Character('c')); // 원래 식
		
		for(char i : list)
			System.out.print(i);
		System.out.println();
		
		for(int i = 0; i<list.size();i++)
			System.out.print(list.get(i)+"\t");
		
		
		
		
		
	}

}

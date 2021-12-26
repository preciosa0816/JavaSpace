package p02.list.stack;

import java.util.Stack;
//Stack : List계열
// 동작: LIFO(Last In First Out)
public class StackEx1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack();
		s.push("마포구");
		s.push("강남구");
		s.push("달서구");
		System.out.println(s);
		while(!s.isEmpty()) {  //pop():출력후 제거
			System.out.println(s.pop());
			System.out.println(s);
		}
		System.out.println();
		
//		while(!s.isEmpty()) {  //peek():출력후 제거x, 무한반복
//			System.out.println(s.peek()); //마지막요소만 빼고다시넣고를 무한반복함
//			System.out.println(s);
//		}

	}

}

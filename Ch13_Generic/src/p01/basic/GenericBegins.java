package p01.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericBegins {

	public static void main(String[] args) {
		// 배열에 여러 타입 넣기
		ArrayList<Object> a1 = new ArrayList<>();
		a1.add("홍길동");
		a1.add(1);
		a1.add(12.55);// double
		a1.add(true);
		a1.add(12.55f);
		a1.add('a');// char

		System.out.println(a1);

		for (int i = 0; i < a1.size(); i++)
			System.out.println(a1.get(i));

		for (Object s : a1)
			System.out.println(s);

		//반복자(Iterator)
		System.out.println("------반복자(Iterator)/for------"); // 인터페이스
		for (Iterator<Object> it = a1.iterator(); it.hasNext();) {// hasNext():다음에 읽을 내용이 있느냐
			Object name = it.next();
			System.out.println(name);
		}

		System.out.println("------반복자(Iterator)/while------");
		Iterator<Object> it = a1.iterator();
		while (it.hasNext()) {// hasNext():다음에 읽을 내용이 있느냐
//			Object name = it.next();
//			System.out.println(name);						
			System.out.println(it.next());

		}

	}

}

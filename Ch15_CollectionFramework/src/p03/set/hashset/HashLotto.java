package p03.set.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashLotto {

	public static void main(String[] args) {
		// HashSet에 로또번호 넣고 출력하기: 32,6,45,90,1,23
		System.out.println("-------------혼자--------------");
		HashSet<Integer> hs = new HashSet<Integer>();
		int k;
		for (int i = 0; i < 6; i++) {
			k = (int) ((Math.random() * 45) + 1);
			hs.add(k);
		}
		System.out.println(hs);
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------수업---------------");

		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; s.size() < 6; i++) {
			int num = (int) ((Math.random() * 45) + 1);// 1~45 뽑기
			s.add(num);
		}
		
		System.out.println(s);
		
		//=>오름차순 순서(sort())만들고 리스트에 저장후 출력
		List<Integer> list = new LinkedList<Integer>(s);//리스트로 저장하기
		Collections.sort(list); // 순서정렬하기
		System.out.println(list);//오름차순으로 출력한 데이터
		
		System.out.println("------------ArrayList로도 해보기");
		List<Integer> list1 = new ArrayList<Integer>(s);//리스트로 저장하기
		Collections.sort(list1); // 순서정렬하기
		System.out.println(list1);//오름차순으로 출력한 데이터
		
	}

}

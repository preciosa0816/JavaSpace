package p05.compable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Com_Main {

	public static void main(String[] args) {
		List<ItemT> list = new ArrayList<ItemT>();
		list.add(new ItemT(2));
		list.add(new ItemT(0));
		list.add(new ItemT(1));
		//1
		System.out.println(list);

		//2
		for (ItemT t : list) {
			System.out.print(t.order);
		}
		
		System.out.println();
		
		//3. 기본정렬(오름차순) : comparable 재정의//ItemT 클래스에 comparable을 재정의 해놨기 때문
		Collections.sort(list);
		for (ItemT t : list) {
			System.out.print(t.order);
		}
		
		System.out.println();
		//4. 오름차순 : //comparator로 재정의함
		Collections.sort(list, new OrderAscSorting());
		for (ItemT t : list) {
			System.out.print(t.order);
		}
		
		System.out.println();
		//5. 내림차순 : //comparator로 재정의함
				Collections.sort(list, new OrderDescSorting());
				for (ItemT t : list) {
					System.out.print(t.order);
				}
		

	}
}

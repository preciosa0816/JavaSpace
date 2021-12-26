package p02.list.linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000;i++) {//0의자리에 숫자가 차면 뒤로 밀린다.
			list1.add(0,String.valueOf(i));
			
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList 걸린시간 : "+(endTime-startTime)+" ns");
		
		startTime=System.nanoTime();
		for(int i=0; i<10000;i++) {
			list2.add(0,String.valueOf(i));		
		}
		endTime=System.nanoTime(); //linked List 가 더 빠르다
		System.out.println("LinkedList 걸린시간 : "+(endTime-startTime)+" ns");
	
//		List<Integer> list5 = new LinkedList<>();
//		list5.add(0,5);
//		list5.add(0,2);
//		list5.add(0,1);
//		list5.add(0,4);
//		list5.add(0,3);
//		System.out.println(list5);
	}
	
	

}

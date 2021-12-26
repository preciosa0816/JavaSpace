package p05.compable_comparator;

import java.util.Comparator;
//comparator<T>: 특수정렬(내림차순)

//오름차순
public class OrderAscSorting implements Comparator<ItemT> {

	//0:위치교환x  
	//1: 위치교환O 
	//-1: 위치유지(변동사항x)
	@Override
	public int compare(ItemT o1, ItemT o2) {
		if(o1.order==o2.order) return 0;//위치변환x
		else if(o1.order>o2.order) return 1; //오름차순이므로 바꾸기
		else return -1; //내림차순이므로 유지하기
	}


}

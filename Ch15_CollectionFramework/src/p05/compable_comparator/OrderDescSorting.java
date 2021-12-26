package p05.compable_comparator;
//comparator<T>: 특수정렬(내림차순)
import java.util.Comparator;

//내림차순
public class OrderDescSorting implements Comparator<ItemT> {

	@Override
	public int compare(ItemT o1, ItemT o2) {
		if(o1.order==o2.order) return 0;
		else if(o1.order>o2.order) return -1; 
		else return 1; 
	}


}

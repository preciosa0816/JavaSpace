package p05.compable_comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample2 {

	public static void main(String[] args) {
		//Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
//		TreeSet<Fruit> treeSet= new TreeSet<Fruit>();
//		treeSet.add(new Fruit("포도", 3000));
//		treeSet.add(new Fruit("수박", 10000));
//		treeSet.add(new Fruit("딸기	", 6000));
		
		
		//내림차순 정렬된 DescendingComparator()사용
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기	", 6000));	
		
		Iterator<Fruit> it =treeSet.iterator(); 
		while(it.hasNext()) {
			Fruit fruit = it.next();
			System.out.println(fruit.name+" : "+fruit.price);
		}
	}

}

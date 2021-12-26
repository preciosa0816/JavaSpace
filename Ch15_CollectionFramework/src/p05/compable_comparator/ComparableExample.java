package p05.compable_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> it =treeSet.iterator(); //오름차순 정렬
		while(it.hasNext()) {
			Person person = it.next();
			System.out.println(person.name+" : "+person.age);
		}
	}

}

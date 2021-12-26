package p03.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String>set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");//Java는 한번만 저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);

		
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println("\t"+it.next());
		}
			
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : "+set.size());
		
		it = set.iterator();
		while(it.hasNext()) {
			System.out.println("\t"+it.next());
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("empty");}
		
	}

}

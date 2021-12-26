package p03.set.treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("apple");
		ts.add("f");
		ts.add(new String("forever"));
		ts.add("description");
		ts.add("ever");
		ts.add("zoo");
		ts.add("base");
		ts.add("guess");
		ts.add("c");
		ts.add("cherry");
		
		//1.자동 정렬
		System.out.println(ts);		
		System.out.println("[c~f사이의 단어 검색]");
		
		// c=<subSet()<f
		SortedSet<String>s = ts.subSet("c",	"f");//
		System.out.println(s);
		
		// c=<subSet()<=f
		NavigableSet<String> n = ts.subSet("c", true, "f", true);//c로시작하는 단어 포함, "f"는 포함
		System.out.println(n);
		
		for(String g:n)
			System.out.print(g+" ");
	}

}

package p02.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//List 계열 : 자료가 순차적이고 중복적인 자료일 경우 사용.
//ArrayList : 비동기적 
//Vector : 동기적(멀티스레드가 동시에 메소드들을 수행 불가, 멀티스레드 환경에서 안전하게 객체를 추가/삭제 가능)
public class VectorEx1 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("삼성");
		v1.addElement("삼성2");
		v1.addElement("LG");
		v1.addElement("Google");
		//1.
		System.out.println(v1);
		System.out.println();
		//2. for문
		for(int i=0;i<v1.size();i++)
			System.out.println("v1의 "+i+"번째 요소 : "+ v1.elementAt(i));
		System.out.println();
		
		for(String k : v1)
			System.out.println(k);
		System.out.println();
		
		Iterator<String >it = v1.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println();
		
		//3. 열거형		
		Enumeration<String> E = v1.elements();
		while(E.hasMoreElements())
			System.out.println(E.nextElement());
		
		
	}

}

package p02.list.arraylist;
//List계열 : 맨 꼭대기에 Iterable - collection-List-ArrayList/vector/linkedList/stack
//자료가 순차적이고 중복적인 자료인 경우 사용
// 대표적 = ArrayList
//Array : 크기가 정적
//ArrayList: 크기가 동적, 향후 사용 - 비동기적(속도, 효율 높음)
//vector : 초기사용, 동기적(속도,효율 낮음)
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("포도");//index:0
		list.add("딸기");//index:1
		list.add("딸기");//index:2
		list.add("복숭아");//index:3
		///1.
		System.out.println(list);//[포도, 딸기, 딸기, 복숭아], 개발자가 만든클래스로 주소값x
		System.out.println(list.size());
		
		
		//2
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
		//index1 : 키위
		list.add(1, "키위"); //넣으면 남은값은 뒤로 밀림
		list.set(2, "오렌지"); //원래 있던값을 없애고 바꿈
		list.remove(1);//인덱스값으로 지우기
		list.remove("복숭아");//value값으로 지우기
		list.add("키위");
		list.add("키위");
		System.out.println();
		for(int i=0;i<list.size();i++) {
			String k = (String)list.get(i);
			System.out.println(k);
		}	
		System.out.println(list.size());
		int l = list.indexOf("키위");
		System.out.println("첫번째 키위(index): "+l);
		int i2 = list.lastIndexOf("키위");
		System.out.println("마지막 키위(index): "+i2);
		System.out.println();
		
		
		
		System.out.println();
		//3.향상된 for문
		for(String i : list)
			System.out.println(i);
		
		
		//4.iterator
		System.out.println("------내가 한 iterator------");
		Iterator<String> i = list.iterator();
		if(i.hasNext()) {
			for(int k=0; k<list.size();k++)
				System.out.println(i.next());
		}
		
		System.out.println("===수업한 iterator===");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
	}

}

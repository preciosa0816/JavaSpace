package p06.study.p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0; 	 // 최고 점수 저장
		int totalScore=0;	//점수 합계 저장

		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it =set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry=it.next();
			String n = entry.getKey();
			Integer score = entry.getValue();
			if(maxScore<score) {
				maxScore=score;
				name=n;
			}
			totalScore+=score;
			
			
		}
			
		System.out.println("평균점수 : "+totalScore/3);
		System.out.println("최고점수 : "+maxScore);
		System.out.println("최고점수를 받은 아이디 : "+name);
		
	}

}

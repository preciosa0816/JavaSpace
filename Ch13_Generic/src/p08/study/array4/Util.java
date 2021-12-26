package p08.study.array4;

public class Util {
	 //왜 Integer를 쓰지? int쓰면 왜 오류가 날까? null값이 불가하기 때문
	public static <T extends Pair> Integer getValue(T p1 , String key) {
		if(key==p1.getKey())
			return (Integer) p1.getValue();
		else
			return null;			
	}

	
	
//	public static <T extends Pair> Integer getValue(T p1, String key) {
//		if(key == p1.getKey())
//		return (Integer) p1.getValue();
//		else
//		return null;
//	}

	
	
	
//	public static <K,V> V getValue(Pair<K, V> pair, K key) {
//		if(pair.getKey().equals(key)) {
//			return pair.getValue();
//		}
//			return null;
//		}

}

package p04.generic_method;

public class Util2 {
	
	//compare(): 두개의 Pair을 매개값으로 받아 K와 V값이 동일한지 검사하고 boolean값을 리턴
	public static  <K, V> boolean compare(Pair<K, V>p1, Pair<K, V>p2) {
		
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare; //둘다 같아야 true
	}
}

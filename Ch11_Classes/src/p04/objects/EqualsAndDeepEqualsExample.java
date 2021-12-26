package p04.objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1=1000;
		Integer o2=1000;
		System.out.println(Objects.equals(o1, o2));//a.equlas(b)의 값 출력
		System.out.println(Objects.equals(o1, null)); //false
		System.out.println(Objects.equals(null, o2));//false
		System.out.println(Objects.equals(null,null));//둘다 null일 경우 true를 리턴함
		System.out.println(Objects.deepEquals(o1, o2)+"\n");
		
		//Object.deepEquls(Object a, Object b): 두 객체의 동등을 비교하는데,
		//a와 b가 서로 다른 배열일 경우, 항목 값이 같다면 true리턴
		//=Array.deepEqulas(Object[]a,Object[]b)
		
		Integer[] arr1= {1,2};
		Integer[] arr2= {1,2};
		System.out.println(Objects.equals(arr1, arr2));//a.equlas(b)의 값 출력
		System.out.println(Objects.deepEquals(arr1, arr2)); //항목 값이 같아서 true
		System.out.println(Arrays.deepEquals(arr1, arr2)); //Object.deepEquls(Object a, Object b)
		System.out.println(Objects.deepEquals(null, arr2));//false
		System.out.println(Objects.deepEquals(null,null)); //둘다 null일 경우 true를 리턴함
	
	}

}

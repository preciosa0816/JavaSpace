package p03.for_while_dowhile;

public class ForEx2 {

	public static void main(String args[]) { //String[] 문자열만 있는 배열 args변수로 지칭
		int arr[] = {10,20,30,40,50};		   //int[] 숫자열만 있는 배열 arr로 지칭			
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
		
		System.out.println("------------------------");
		
		int k=0;
		//일반for
		for(int i=0; i<arr.length;i++) {
		k = k+arr[i];
		
			System.out.println(arr[i]);
			System.out.println(k);
		}
		System.out.println("------------------------");
		
		//향상된 for (java5)
		for(int s :arr) {
			System.out.println(s);
				}
		
	}
	
}
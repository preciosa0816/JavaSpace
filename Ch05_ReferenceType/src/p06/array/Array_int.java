package p06.array;
//Array : 같은 타입, 중복적으로 순차적으로 나열되어있는 data, 참조 타입(주소값저장)
// 			 크기를 미리 정해야함.

public class Array_int {

	public static void main(String[] args) {
		int a = 10;
		String str = new String(); // 객체생성
		//배열을 생성하는 방법 3가지
		//1
		int arr1[] = {10,20,30}; //배열 변수에는 주소값 저장
		//int[]  arr1= {10,20,30}; (o)
		System.out.println(arr1[0]);
		System.out.println(arr1); //배열변수 출력(참조타입변수), 주소값 출력
		
		for(int k=0; k<arr1.length;k++) {			
			System.out.println("arr1["+k+"] :"+arr1[k]);
		}
		
		//2
		int arr2[] =new int[] {40,50,60}; //객체 생성과 다름, 배열생성
		System.out.println(arr2[0]);
		
		for(int k=0; k<arr1.length;k++) {			
			System.out.println("arr2["+k+"] :"+arr2[k]);
		}	
			//향상된 for문(java5)
		for(int i :arr2) {
		System.out.println(i);
		}
		
		//3
		int arr3[] = new int[3]; 
		arr3[0]=70; 
		arr3[1]=80; 
		arr3[2]=90; 
		
		System.out.println(arr3[2]);
		System.out.println(arr3[0]+arr3[1]+arr3[2]);
	}

}

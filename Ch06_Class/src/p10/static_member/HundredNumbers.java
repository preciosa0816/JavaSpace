package p10.static_member;

public class HundredNumbers {
	
	static int arr[]; //공유배열변수
	static { //static 초기화블록 //객체생성시 최초한번
		
		arr =new int[100];
		for (int i=0;i<100;i++) {
			arr[i]=i;
			//System.out.println(arr);
		}
	}
	
}

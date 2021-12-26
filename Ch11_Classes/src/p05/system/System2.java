package p05.system;

public class System2 {

	public static void main(String[] args) {
		int [] arr1 = {77,82,99,100-27,0,42,-35,60,72};
		int [] arr2 = {7,0,3,0,-1,2,11,5,0,9};
		
		for(int i = 0; i<arr1.length;i++) {
			
			try {
				int result = arr1[i]/arr2[i];
				//system.out 버퍼 존재
				System.out.printf("%d / %d=%d%n",arr1[i],arr2[i],result);
			} catch (Exception e) {
				
				//system.err 버퍼 존재
				//버퍼 : 기억공간으로 이 공간이 꽉 채워야 내보냄, 공간안에서는 수정가능
				System.err.println("잘못된 연산입니다.(index="+i+")"); 
				//err를 사용했을때 출력결과들이 자꾸 바뀐다.(실행순서 변경됨)
			}
		
		}

	}

}

package p04.two;

public class CheckOverflowExample {

	public static void main(String[] args) {
		
		CheckOverflowExample c = new CheckOverflowExample();
		try {
			int result = c.safeAdd(200000000, 200000000);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("오버플로우가 발생합니다. 숫자를 줄여주세요");
			//e.printStackTrace();
		}
		System.out.println("Done");
	}
	
	public int safeAdd(int left, int right) {
		if(right >0) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
			
		}else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			
			}
			
		}
		
		return left+right;
	}
}

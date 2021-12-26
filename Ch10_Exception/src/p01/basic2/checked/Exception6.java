package p01.basic2.checked;

public class Exception6 {

	public static void main(String[] args) {//throw exception2 -> 최종적으로 jvm으로 감
		try {
			int result=add(1,-2);
			System.out.println(result);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

	}
	
	static int add(int a, int b) throws Exception { //throw exception1
		int result =a+b;
		if (result<0)
			throw new Exception("강제로 예외처리함");
		
		return result;
	}

}

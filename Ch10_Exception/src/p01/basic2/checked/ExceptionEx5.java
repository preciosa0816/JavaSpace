package p01.basic2.checked;
//Checked Exception : 예외처리를 반드시 해야 실행가능(하지않으면 컴파일에러)
public class ExceptionEx5 {

	public static void main(String[] args) {
		int sum=1+-2;
		if (sum<0)
		 try {
				throw new Exception("Checked Exception 에러발생");//예외를 강제로 발생시킨 것
			} catch (Exception e) {
				System.out.println("throw로 던진 내용을 catch로 받음");
				System.out.println(e.getMessage()); //
			}
				
			System.out.println(sum);
		
	}

}

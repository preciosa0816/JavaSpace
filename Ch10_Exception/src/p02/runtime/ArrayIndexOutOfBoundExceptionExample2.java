package p02.runtime;

public class ArrayIndexOutOfBoundExceptionExample2 {

	public static void main(String []args) { //원래는 값이 비어있어서 실행이 안됨
		
//		String data[]=new  String[2];
//		String data1 = data[0];
//		String data2 = data[1];
				
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: "+data1);
		System.out.println("args[1]: "+data2); // *****************질문

	}

}

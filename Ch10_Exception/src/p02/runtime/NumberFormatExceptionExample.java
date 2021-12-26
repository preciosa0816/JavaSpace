package p02.runtime;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1="100";
		String data2="a100"; 
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2); // a100은 숫자로 변환할수 없기 때문에 ERROR
		
		int result = value1+value2;
		System.out.println(data1+"+"+data2+"="+result);
	}

}

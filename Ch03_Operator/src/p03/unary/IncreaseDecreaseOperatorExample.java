package p03.unary;

public class IncreaseDecreaseOperatorExample {

	
	//args : 파라미터(Parameter) 변수
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z; //z=0
		int k; 
		
		System.out.println("---------------------");
		x++;
		++x;
		System.out.println("x="+x);
		
		
		System.out.println("---------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		
		System.out.println("---------------------");
		z=x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("---------------------");
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("---------------------");
		z=++x + y++;
		
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}

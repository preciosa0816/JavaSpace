package p08.method;

public class MyMathEx {

	public static void main(String[] args) {
		MyMath m1 = new MyMath();
		m1.add(10, 20);
		System.out.println(m1.add(10, 20));
		System.out.println(m1.add(20L, 30));
		//System.out.println(m1.add(20, 30L)); //void라 실행 x
		//System.out.println(m1.add(20L, 30L));
		
		int[]a= {100,200,300};
		//m1.add(a);
		System.out.println(m1.add(a));
	}

}

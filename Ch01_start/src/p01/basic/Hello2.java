package p01.basic;

public class Hello2 {
	public static void main(String[] args) {
		System.out.println("Hello2");
		int total=0;
		for(int cnt=1; cnt<=100; cnt++) {
			total=total+cnt;
		}
		System.out.println("1+2+...100= "+total);
	}
}

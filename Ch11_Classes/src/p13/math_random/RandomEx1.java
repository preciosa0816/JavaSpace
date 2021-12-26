package p13.math_random;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		
		Random r1 = new Random();
		Random r2 = new Random();
		
		System.out.println("=random =");
		for(int i =0; i<5;i++) {
			System.out.println(i+":"+r1.nextInt());
			//nextInt():random이 가진 것중에 숫자를 뽑겠다			
		}
		
		System.out.println();
		
		for(int i =0; i<5;i++) {
			System.out.println(i+":"+r1.nextInt()); 
					
		}
		System.out.println("--------------------------------");
		// Random(long seed) : 같은 random값 유지
		Random r3 = new Random(1); //long seed를 같은 숫자를 줘서
		Random r4 = new Random(1); 	// 두값의 결과는 동일
		
		System.out.println("=random =");
		for(int i =0; i<5;i++) {
			System.out.println(i+":"+r3.nextInt());		
		}
		
		System.out.println();
		
		for(int i =0; i<5;i++) {//위의 random으로 뽑은 값과 동일
			System.out.println(i+":"+r4.nextInt()); 
			
		}
	}

}

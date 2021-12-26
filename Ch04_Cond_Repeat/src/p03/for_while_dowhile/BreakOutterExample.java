package p03.for_while_dowhile;

public class BreakOutterExample {

	public static void main(String[] args) {
	Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			   for (char lower = 'a'; lower <= 'z'; lower++) {
				   //System.out.println(upper + "-" + lower);
				   if (upper == 'C') {
					   
					   break Outter;
					   
				   }
				    System.out.println(upper + "-" + lower);//A-g는 출력x
			   }
		}
	System.out.println("Done");
	}

}

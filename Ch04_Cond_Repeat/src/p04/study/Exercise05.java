package p04.study;

public class Exercise05 {

	public static void main(String[] args) {
		int x;
		int y;
		for (x=0;x<11;x++) {
			for(y=0;y<11;y++) {
				if (4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
			}
			
		}

	}

}

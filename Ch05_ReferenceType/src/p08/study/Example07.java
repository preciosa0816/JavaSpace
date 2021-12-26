package p08.study;

public class Example07 {

	public static void main(String[] args) {
		int max=0;
		int[]array= {1,5,3,8,2};
		int a=0;
		for (int i=0;i<array.length;i++) {
			if (array[i]>a) {			
				max=array[i];
				a=array[i];
			}
		}
		
		
		System.out.println("max: "+max);

	}

}

package p05.api;

import java.util.function.IntSupplier;
//Supplier()  : 매개 없이 리턴값만 존재
public class SupplierExample {

	public static void main(String[] args) {

		// 익명구현객체
		IntSupplier is = new IntSupplier() {
			@Override
			public int getAsInt() {
				int num = (int) (Math.random() * 6 + 1);
				return num;
			}
		};
		int num = is.getAsInt();
		System.out.println(num);

		// 람다식
		IntSupplier is2 = ()-> 	(int) (Math.random() * 6 + 1);			
		int num2 = is2.getAsInt();
		System.out.println(num2);
	}

}

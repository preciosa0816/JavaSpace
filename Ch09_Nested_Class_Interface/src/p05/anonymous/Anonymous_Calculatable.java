package p05.anonymous;

public class Anonymous_Calculatable {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1=0;
		int var2=0;
		
		field = 10;
		
		//arg1=20; (x)// final 변경불가
		//arg2=20;		//설정시 밑의 메소드에서 이용불가 - final만 이용가능하기 때문
		
		// var1=30; (x) // final 변경불가
		//var2=30;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field+arg1+arg2+var1+var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}

package p08.abstract_class;

public class MyClass_Main {

	public static void main(String[] args) {
		
		MyClassChild mc = new MyClassChild();
		System.out.println(mc.num);
		mc.methodA();
		mc.methodB(); //overriding 된 추상메소드임
		
		
		
		
		
		/*
		 * //익명 추상클래스(객체생성 된 것 x) MyClass m = new MyClass() {
		 * 
		 * @Override public void methodB() { // TODO Auto-generated method stub
		 * 
		 * } };
		 */
	}

}

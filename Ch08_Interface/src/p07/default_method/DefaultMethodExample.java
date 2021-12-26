package p07.default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		MyInterface mi1=new MyClassA(); //부모 |자식
		mi1.method1();
		mi1.method2();
		
		MyInterface mi2 = new MyClassB();//부모 |자식
		mi2.method1();
		mi2.method2();
		

	}

}

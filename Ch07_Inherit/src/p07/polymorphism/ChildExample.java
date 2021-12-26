package p07.polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		// parent.method3(); // 호출불가 casting 필요

		
		parent.field1="data1";
		parent.method1();
		parent.method2();
		
		
//		parent.field2="data2"; //불가능
//		parent.method3();
		
		Child child2 = (Child) parent;
		child2.field2="yyy"; //가능
		child2.method3();
		
		
	}

}

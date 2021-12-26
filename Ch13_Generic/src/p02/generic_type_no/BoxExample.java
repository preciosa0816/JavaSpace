package p02.generic_type_no;
//Generic을 사용하지 않았을 때
public class BoxExample {

	public static void main(String[] args) {
		
		Box b = new Box();
		b.setObj("홍길동"); //자동형변환(큰타입=>작은타입) : Object->String
		String name = (String) b.getObj(); //강제형변환
		System.out.println(name);//
		
		System.out.println();
		b.setObj(new Apple());//자동타입변환(Apple->Object)
		Apple a = (Apple) b.getObj();//강제타입변환(Object->Apple)
		System.out.println(a);
	}

}

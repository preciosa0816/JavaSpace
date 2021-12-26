package p10.static_member;

public class SingletonExample {

	public static void main(String[] args) {

		/*
		 * Singleton obj1=new Sington(); //컴파일에러 
		 * Singleton obj2=new Sington(); //컴파일에러
		 */	
		
	 Singleton obj1 = Singleton.getInstance();
	 Singleton obj2 = Singleton.getInstance();
	 
	 if(obj1==obj2) {
		 System.out.println("같은 singleton 객체입니다");
	 }else {
		 System.out.println("다른 singleton 객체입니다");
	 }
	}

}

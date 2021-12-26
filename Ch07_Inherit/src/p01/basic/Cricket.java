package p01.basic;

public class Cricket extends Game {
	
	@Override
	public void type() {
		System.out.println("inherit Cricket Game");
		
	}
	
	public void write() {
		System.out.println("Cricket Method()");
	}
	
	public static void main(String[] args) {
		
		//1. 일반 객체
		Game g = new Game(); //부모객체
		g.type();
//		((Cricket) g).write(); // 형변환 but 불가능 
		
		//2. 자식 객체
		Cricket c = new Cricket(); //자식객체
		c.type();
		c.write();
		
		//3. polymorphism
		Game g2 = new Cricket();
		Cricket ck =  (Cricket) g2; // 부모가 큰 타입임 (g2), 자식이 작은 타입(ck) 형변환[1]
											// Add cast to 'Cricket' 
		g2.type();
		((Cricket) g2).write(); //형변환[2] 전 :보이지 않음 형변환 후 : o --casting
		ck.type();
		ck.write();
		
	}
}

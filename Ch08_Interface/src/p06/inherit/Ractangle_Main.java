package p06.inherit;

public class Ractangle_Main {

	public static void main(String[] args) {
		Ractangle re = new Ractangle(100, 200, 10, 10);
				
		printRactangle(re);
		System.out.println();
		
		//(25,35) 이동
		System.out.println("====(25,35) 이동====");
		re.moveTo(25, 35);
		printRactangle(re);
		System.out.println();
		System.out.println("====(-5씩) 이동====");
		re.moveBy(-5, -5);
		printRactangle(re);
		System.out.println();
		System.out.println("====사각형 크기 바꾸기====");
		re.resize(30, 30);
		printRactangle(re);
	}

	static void printRactangle(Ractangle r) { //다형성아님
		System.out.println("사각형의 위치(x,y) : "+"("+r.x+","+r.y+")");
		System.out.println("사각형의 크기(width,height) : "+"("+r.width+","+r.height+")");
	}
	
	
	
}

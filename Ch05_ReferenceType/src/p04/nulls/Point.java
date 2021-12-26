package p04.nulls;

public class Point {
	int x, y; // 기본 생성자

	public Point() {
		System.out.println("기본생성자");
	}

	// 생성자: 객체 생성시 초기값 저장 용도
	public Point(int x2, int y2) { // 파라미터가 있는 생성자
		// super();
		this.x = x2; // this.x는 class point에 있던 int x임(위), x는 생성자에있는 int x
		this.y = y2;
		System.out.println("파라미터가 있는 생성자");
	}

	/*
	 * public Point(int x1, int y1) { //super(); this.x = x; int x1 this.y = y1; }
	 */

}

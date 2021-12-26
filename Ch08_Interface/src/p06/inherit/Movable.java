package p06.inherit;

//위치 이동 인터페이스
public interface Movable {
	// 추상메소드
	void moveTo(int x, int y); //절대위치 이동
	void moveBy(int x, int y); //상대위치 이동
	

}

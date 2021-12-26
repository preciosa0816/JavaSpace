package p06.inherit;

//변환 인터페이스
//다중 인터페이스 가능
public interface Transformable extends Movable {
	void resize(int width, int height);
	
}

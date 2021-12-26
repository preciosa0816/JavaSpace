package p07.inherit_interface;

public interface Storage<T>{ 
	public void add(T item, int index);// 추상메소드
	
	public T get(int index);//추상메소드
	

}

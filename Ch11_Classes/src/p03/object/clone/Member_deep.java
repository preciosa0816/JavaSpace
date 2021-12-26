package p03.object.clone;

import java.util.Arrays;

public class Member_deep implements Cloneable{
	public String name;
	public int age;
	public int[]scores; //참조타입필드(깊은 복제 대상)
	public Car car;		//참조타입필드(깊은 복제 대상)
	
	public Member_deep(String name, int age, int[] scores, Car car) { //scores[]와 car은 참조객체
		//super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override //clone메소드 재정의
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member_deep cloned = (Member_deep) super.clone(); //Object의 clone()호출
		
		//scores를 깊은 복제 한다.
		cloned.scores=Arrays.copyOf(this.scores,  this.scores.length);
		
		//car를 깊은 복제 한다.
		cloned.car= new Car(this.car.model);
		
		//깊은 복제된 Member객체를 리턴
		return cloned;
	}
	public Member_deep getMember() {
		Member_deep cloned = null;
		
		try {
			cloned = (Member_deep) clone();
		} catch (CloneNotSupportedException e) {
					e.printStackTrace();
		}
		return cloned;
		
	}
	
}

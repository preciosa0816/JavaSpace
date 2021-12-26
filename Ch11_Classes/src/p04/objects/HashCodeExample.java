package p04.objects;

import java.util.Objects;
//해시코드 생성
public class HashCodeExample {

	public static void main(String[] args) {
	
		//Objects.hashCode는 Object.hasch()의 리턴값과 동일
		//차이점 : 매개값이 null이면 0을 리턴함.
		
		Student s1=new Student(1, "홍길동");
		Student s2=new Student(1, "홍길동");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2)); 

	}
	
	static class Student{
		int sno;
		String name;
		public Student(int sno, String name) {
			super();
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			
			return Objects.hash(sno,name);
		}
	}

}
